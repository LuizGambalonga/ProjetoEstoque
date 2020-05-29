
package Model;

import Enums.Unidade;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.processing.Generated;
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
@Table(name = "PRODUTO")
public class Produto implements java.io.Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID",nullable = false)
  @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
  private Integer id;
  //
  @Column(name = "NOME",length = 150,nullable = false)
  @SwingColumn(description = "NOME",colorOfBackgound = "")
  private String nome;
  //
  @Column(name = "VALOR",length = 12,nullable = false)
  @SwingColumn(description = "VALOR",colorOfBackgound = "")
  private Double valor;
  //
   @Column(name = "QUANTIDADE",length = 10,nullable = false)
   @SwingColumn(description = "QUANTIDADE",colorOfBackgound = "")
    private Integer quantidade;
  //
  @Column(name = "UNIDADE",length = 2,nullable = false)
  @Enumerated(EnumType.STRING)
  private Unidade unidade;
   //
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_MODELO",referencedColumnName = "ID")
  private Modelo modelo;
  //
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FABRICANTE",referencedColumnName = "ID")
  private Fabricante fabricante;
  //
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORNECEDOR",referencedColumnName = "ID")
  private Fornecedor fornecedor;
  //FIM
  
  public Produto(){
  this.setId(0);
  this.setModelo(null);
  this.setFabricante(null);
  this.setFornecedor(null);
  }
   public Produto(Integer id,String nome,Double valor,Integer Quantidade,Unidade unidade ,Modelo modelo,Fabricante fabricante,Fornecedor fornecedor){
  this.setId(id);
  this.setNome(nome);
  this.setValor(valor);
  this.setQuantidade(quantidade);
  this.setUnidade(unidade);
  this.setModelo(modelo);
  this.setFabricante(fabricante);
  this.setFornecedor(fornecedor);       
  }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id<0?0:id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public Double getValor() {
        return this.valor;
    }

    public Unidade getUnidade() {
        return this.unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade == null? Unidade.UN:unidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo ==null? new Modelo():modelo;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante ==null? new Fabricante():fabricante;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor == null ? new Fornecedor():fornecedor;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   
}
