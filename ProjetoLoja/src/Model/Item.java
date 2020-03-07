
package Model;

import Enums.StatusItem;
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
@Table(name = "ITEM")

public class Item implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @SwingColumn(description = "ID")
    private int id;
    //
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VENDA", nullable = false,referencedColumnName = "ID")
    private Vendas vendas;
    //
    @ManyToOne(fetch = FetchType.LAZY)
    @SwingColumn(description = "PRODUTO")
    @JoinColumn(name = "ID_PRODUTO", nullable = false,referencedColumnName = "ID")
    private Produto produto;
    //
    @Enumerated(EnumType.STRING)
    @SwingColumn(description = "SITUAÇÃO")
    @Column(name = "ATIVO", nullable = false, length = 1)
    private StatusItem ativo;
    //FIM
    public Item(){
        
    }
    public Item(int id,Vendas vendas,Produto produto,StatusItem ativo){
     this.setId(id);
     this.setProduto(produto);
     this.setAtivo(ativo);
     this.setVendas(vendas);
    }
    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public StatusItem getAtivo() {
        return ativo;
    }

    public void setAtivo(StatusItem ativo) {
        this.ativo = ativo==null? StatusItem.S : ativo;
    }

    @Override
    public String toString(){
        return this.produto.getNome() + " - " + this.ativo.getDescricao();
    }
    
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.id;
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
        final Item other = (Item) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
  
    
}
