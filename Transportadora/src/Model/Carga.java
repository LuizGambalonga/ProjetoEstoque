
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
@Table(name = "CARGA")
public class Carga implements java.io.Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID",nullable = false)
@SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
private Integer id;
 //
@Column(name = "Frete",length = 10,nullable = false)
@SwingColumn(description = "Frete",colorOfBackgound = "")
private Double frete;

@Column(name = "QuantidadeProduto",length = 10,nullable = false)
@SwingColumn(description = "QuantidadeProduto",colorOfBackgound = "")
private int quantidadeproduto;
// buscou a foreign produto
@ManyToOne(fetch =FetchType.LAZY )
@SwingColumn(description = "Produto",colorOfBackgound = "")
@JoinColumn(name = "ID_PRODUTO",referencedColumnName = "ID")
private Produto produto;
@Column(name = "UNIDADE",length = 2,nullable = false)
  @Enumerated(EnumType.STRING)
  private Unidade unidade;
 //
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

@Column(name = "Motorista",length = 10,nullable = false)
@SwingColumn(description = "Motorista",colorOfBackgound = "")
private String motorista;
//FIM
    public Carga() {
     this.setId(0);
     this.setFrete(0.01);
     this.setProduto(null);
     this.setCidade(null);
     this.setEstado(null);
     this.setPais(null);
    }

    public Carga(Integer id,Double frete,Integer quantidadeproduto,Produto produto,Unidade unidade,Cliente cliente,Fabricante fabricante,Fornecedor fornecedor,Cidade cidade ,Estado estado,Pais pais,String motorista) {
      this.setId(id);
      this.setFrete(frete);
      this.setQuantidadeproduto(quantidadeproduto);
      this.setProduto(produto);
      this.setUnidade(unidade.UN);
      this.setCliente(cliente);
      this.setFornecedor(fornecedor);
      this.setFabricante(fabricante);
      this.setCidade(cidade);
      this.setEstado(estado);
      this.setPais(pais);
      this.setMotorista(motorista);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id < 0 ? 0:id;
    }
   
    public Cliente getCliente() {
        return cliente;
    }

    public int getQuantidadeproduto() {
        return quantidadeproduto;
    }

    public void setQuantidadeproduto(int quantidadeproduto) {
        this.quantidadeproduto = quantidadeproduto;
    }
    public Unidade getUnidade() {
        return this.unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade == null? Unidade.UN:unidade;
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

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete < 0 ? 0.01 : frete;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade == null ? new Cidade():cidade;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    
@Override
    public String toString() {
        return getMotorista();
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
