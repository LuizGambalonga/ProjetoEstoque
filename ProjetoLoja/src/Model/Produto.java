
package Model;

import Enums.Unidade;
import java.util.Objects;
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
  @Column(name = "UNIDADE",length = 2,nullable = false)
  @Enumerated(EnumType.STRING)
  private Unidade unidade;
   //
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_MODELO",referencedColumnName = "ID")
  private Modelo modelo;
  //
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FABRICANTE_PRODUTO",referencedColumnName = "ID")
  private FabricanteProduto fabricante_produto;
  //
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ID_FORNECEDOR_PRODUTO",referencedColumnName = "ID")
  private FornecedorProduto fornecedor_produto;
  //FIM
  
  public Produto(){
  this.setId(0);
  this.setModelo(null);
  this.setFabricanteProduto(null);
  this.setFornecedorProduto(null);
  }
   public Produto(Integer id,String nome,Double valor,Unidade unidade ,Modelo modelo,FabricanteProduto fabricante_produto,FornecedorProduto fornecedor_produto){
  this.setId(id);
  this.setNome(nome);
  this.setValor(valor);
  this.setUnidade(unidade);
  this.setModelo(modelo);
  this.setFabricanteProduto(fabricante_produto);
  this.setFornecedorProduto(fornecedor_produto);       
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
    

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo ==null? new Modelo():modelo;
    }

    public FabricanteProduto getFabricanteProduto() {
        return this.fabricante_produto;
    }

    public void setFabricanteProduto(FabricanteProduto fabricante_produto) {
        this.fabricante_produto = fabricante_produto ==null? new FabricanteProduto():fabricante_produto;
    }

    public FornecedorProduto getFornecedorProduto() {
        return this.fornecedor_produto;
    }

    public void setFornecedorProduto(FornecedorProduto fornecedor_produto) {
        this.fornecedor_produto = fornecedor_produto ==null ? new FornecedorProduto():fornecedor_produto;
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
