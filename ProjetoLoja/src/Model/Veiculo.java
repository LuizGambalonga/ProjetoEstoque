
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
    @Column(name = "chassis",length = 25,nullable = false)
    @SwingColumn(description = "chassis",colorOfBackgound = "")
    private Integer chassis;
    //
    @Column(name = "renavam",length = 17,nullable = false)
    @SwingColumn(description = "renavam",colorOfBackgound = "")
    private Integer renavam;
    //
    @Column(name = "FABRICACAO",length = 20,nullable = false)
    @SwingColumn(description = "ano de fabricação",colorOfBackgound = "")
    private Integer fabricacao;
    
    @Column(name = "Valor_veiculo",length = 10,nullable = false)
    @SwingColumn(description = "Valor_veiculo",colorOfBackgound = "")
    private Double valor_veiculo;
    //
    @Column(name = "Frete",length = 10,nullable = false)
    @SwingColumn(description = "Frete",colorOfBackgound = "")
    private Double frete;
    //
    @Column(name = "COR",length = 2,nullable = false)
    @Enumerated(EnumType.STRING)
    private Cor cor;
    // buscou a foreign produto
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Modelo",colorOfBackgound = "")
    @JoinColumn(name = "ID_MODELO",referencedColumnName = "ID")
    private Modelo modelo;
    // buscou a foreign produto
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Produto",colorOfBackgound = "")
    @JoinColumn(name = "ID_PRODUTO",referencedColumnName = "ID")
    private Produto produto;
    // buscou a foreign clente
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Cliente",colorOfBackgound = "")
    @JoinColumn(name = "ID_CLIENTE",referencedColumnName = "ID")
    private Cliente cliente;
    // buscou a foreign fornecedor
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Fornecedor",colorOfBackgound = "")
    @JoinColumn(name = "ID_FORNECEDOR",referencedColumnName = "ID")
    private Fornecedor fornecedor;
    // buscou a foreign fabricante
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Fabricante",colorOfBackgound = "")
    @JoinColumn(name = "ID_FABRICANTE",referencedColumnName = "ID")
    private Fabricante fabricante;
    // buscou a foreign cidade
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Cidade",colorOfBackgound = "")
    @JoinColumn(name = "ID_CIDADE",referencedColumnName = "ID")
    private Cidade cidade;
    // buscou a foreign estado
    @ManyToOne(fetch = FetchType.LAZY)
    @SwingColumn(description = "Estado",colorOfBackgound = "")
    @JoinColumn(name ="ID_ESTADO",referencedColumnName = "ID")
    private Estado estado;
    // buscou a foreign pais
    @ManyToOne(fetch = FetchType.LAZY)
    @SwingColumn(description = "Pais",colorOfBackgound = "")
    @JoinColumn(name ="ID_PAIS",referencedColumnName = "ID")
    private Pais pais;
    //FIM
    public Veiculo() {
     this.setId(0);
     this.setPlaca("AAA-0000");
     this.setChassis(00000000000000000);
     this.setRenavam(00000000);
     this.setFabricacao(0000000000);
     this.setValor_veiculo(0.01);
     this.setFrete(0.01);
     this.setCor(cor.AM);
     this.setProduto(null);
     this.setCidade(null);
     this.setEstado(null);
     this.setPais(null);
    }

    public Veiculo(Integer id,String placa,Integer chassis, Integer renavam,Integer frabricacao,Double valor_veiculo,Double frete,Cor cor,Modelo modelo,Produto produto,Cliente cliente,Fabricante fabricante,Fornecedor fornecedor,Cidade cidade ,Estado estado,Pais pais) {
      this.setId(id);
      this.setPlaca(placa);
      this.setChassis(chassis);
      this.setRenavam(renavam);
      this.setFabricacao(fabricacao);
      this.setValor_veiculo(valor_veiculo);
      this.setFrete(frete);
      this.setCor(cor);
      this.setProduto(produto);
      this.setCliente(cliente);
      this.setFornecedor(fornecedor);
      this.setFabricante(fabricante);
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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo == null? new Modelo():modelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente==null ? new Cliente():cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor ==null ? new Fornecedor() :fornecedor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante == null ? new Fabricante():fabricante;
    }

    public Double getValor_veiculo() {
        return valor_veiculo;
    }

    public void setValor_veiculo(Double valor_veiculo) {
        this.valor_veiculo = valor_veiculo <0 ? 0.01 : valor_veiculo;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete < 0 ? 0.01 : frete;
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
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto ==null ? new Produto(): produto;
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
