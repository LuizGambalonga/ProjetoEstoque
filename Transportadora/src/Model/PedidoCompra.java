
package Model;

import java.util.Objects;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOCOMPRA")
public class PedidoCompra implements java.io.Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ID",nullable = false)
   @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
   private Integer id;
   //
   @Column(name = "NOME",length = 100,nullable = false)
   @SwingColumn(description = "NOME",colorOfBackgound = "")
   private String nome;
   //
   @Column(name = "QUANTIDADE",length = 10,nullable = false)
   @SwingColumn(description = "Quantidade",colorOfBackgound = "")
   private int quantidade;
   //
   @Column(name = "SOLICITANTE",length = 100,nullable = false)
   @SwingColumn(description = "SOLICITANTE",colorOfBackgound = "")
   private String solicitante;
   
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
    //
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUTO",referencedColumnName = "ID")
    private Produto produto;
    
   public PedidoCompra(){
   this.setId(0);
   }
    public PedidoCompra(Integer id,String nome, Integer quantidade,String solicitante,Fornecedor fornecedor,Fabricante fabricante,Produto produto){
    this.setId(id);
    this.setNome(nome);
    this.setQuantidade(quantidade);
    this.setSolicitante(solicitante);
    this.setFornecedor(fornecedor);
    this.setFabricante(fabricante);
    this.setProduto(produto);
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
    
    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    

    public String getSolicitante() {
        return this.solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante.toUpperCase();
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor == null ? new Fornecedor():fornecedor;
    }
    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante == null ? new Fabricante():fabricante;
    }
    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto == null ? new Produto():produto;
    }
   

    @Override
    public String toString() {
        return getNome();
    }
@Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final PedidoCompra other = (PedidoCompra) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   
    
    
}
