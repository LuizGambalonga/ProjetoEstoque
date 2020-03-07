
package Model;

import Enums.Cor;
import Enums.Unidade;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "VEICULO")
public class Veiculo implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
    private Integer id;
    //
    @Column(name = "placa",length = 7,nullable = false)
    @SwingColumn(description = "placa",colorOfBackgound = "")
    private String placa;
    //
    @Column(name = "chassis",length = 40,nullable = false)
    @SwingColumn(description = "chassis",colorOfBackgound = "")
    private Integer chassis;
    //
    @Column(name = "renavam",length = 40,nullable = false)
    @SwingColumn(description = "renavam",colorOfBackgound = "")
    private Integer renavam;
    //
    @Column(name = "FABRICACAO",length = 40,nullable = false)
    @SwingColumn(description = "ano de fabricação",colorOfBackgound = "")
    private Integer fabricacao;
    
    @Column(name = "valor",length = 40,nullable = false)
    @SwingColumn(description = "valor",colorOfBackgound = "")
    private Double valor;
    //
    @Column(name = "COR",length = 2,nullable = false)
    @Enumerated(EnumType.STRING)
    private Cor cor;
     // buscou a foreign estado
     @ManyToOne(fetch =FetchType.LAZY )
    @JoinColumn(name = "ID_CIDADE",referencedColumnName = "ID")
    private Cidade cidade;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="ID_ESTADO",referencedColumnName = "ID")
    private Estado estado;
    // buscou a foreign pais
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="ID_PAIS",referencedColumnName = "ID")
    private Pais pais;
    //FIM
    public Veiculo() {
     this.setId(0);
     this.setPlaca("AAA-0000");
     this.setCidade(null);
     this.setEstado(null);
     this.setPais(null);
    }

    public Veiculo(Integer id,String placa,Integer chassis, Integer renavam,Integer frabricacao,Double valor,Cor cor,Cidade cidade ,Estado estado,Pais pais) {
      this.setId(id);
      this.setPlaca(placa);
      this.setChassis(chassis);
      this.setRenavam(renavam);
      this.setFabricacao(fabricacao);
      this.setValor(valor);
      this.setCor(cor);
      this.setCidade(cidade);
      this.setEstado(estado);
      this.setPais(pais);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id < 0 ? 0:id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.length()!=7 ? "AAA-0000":placa;
    }

    public Integer getChassis() {
        return chassis;
    }

    public void setChassis(Integer chassis) {
        this.chassis = chassis;
    }

    public Integer getRenavam() {
        return renavam;
    }

    public void setRenavam(Integer renavam) {
        this.renavam = renavam;
    }

    public Integer getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Integer fabricacao) {
        this.fabricacao = fabricacao <1900 || fabricacao >2020? 1900:fabricacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor <0 ? 0.01 :valor;
    }

   

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado == null ? new Estado():estado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais == null ? new Pais():pais;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor ==null ?  Cor.AM :cor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade == null ? new Cidade():cidade;
    }

    
    @Override
    public String toString() {
        return getPlaca();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        return true;
    }

    
    
}
