
package Model;

import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VENDAS")
public class Vendas implements java.io.Serializable{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "ID",nullable = false)
 @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
 private Integer id;
 //
 @Column(name = "QUANTIDADE",length = 11,nullable = false)
 @SwingColumn(description = "QUANTIDADE",colorOfBackgound = "")
 private Integer quantidade;
 //
  @Column(name = "VALOR",length = 12,nullable = false)
  @SwingColumn(description = "VALOR",colorOfBackgound = "")
 private Double valor;
 //
 @Column(name = "DESCONT0",length = 12)
 @SwingColumn(description = "DESCONTO",colorOfBackgound = "")
 private Double desconto;
 //
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "ID_LOJA",referencedColumnName = "ID")
 private Lojas lojas;
 //
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "ID_CLIENTE",referencedColumnName = "ID")
 private Cliente cliente;
 //
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "ID_VENDEDOR",referencedColumnName = "ID")
 private Vendedores vendedores;
 //
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "ID_PRODUTO",referencedColumnName = "ID")
 private Produto produto;
 //
 //Muitos para muitos
    @OneToMany(mappedBy = "vendas")
    private List<Item> listaItem;
 //Fim
 
 public Vendas(){
 this.setId(0);
 this.setQuantidade(0);
 this.setValor(0.01);
 this.setDesconto(0.01);
 this.setLojas(null);
 this.setCliente(null);
 this.setVendedores(null);
 this.setProduto(null);
 }
 
 public Vendas(Integer id,Integer quantidade,Double valor,Double desconto,Lojas lojas,Cliente cliente
      ,Vendedores vendedores,Produto produto ){
 this.setId(id);
 this.setQuantidade(quantidade);
 this.setValor(valor);
 this.setDesconto(desconto);
 this.setLojas(lojas);
 this.setCliente(cliente);
 this.setVendedores(vendedores);
 this.setProduto(produto);
 }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id<0?0:id;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade<0?0:quantidade;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor<0?0.01:valor;
    }

    public Double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto<0?0.01:desconto;
    }

    public Lojas getLojas() {
        return this.lojas;
    }

    public void setLojas(Lojas lojas) {
        this.lojas = lojas == null?new Lojas():lojas;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente== null?new Cliente():cliente;
    }

    public Vendedores getVendedores() {
        return this.vendedores;
    }

    public void setVendedores(Vendedores vendedores) {
        this.vendedores = vendedores== null?new Vendedores():vendedores;
    }

    public List<Item> getListaItem() {
        return listaItem;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto== null?new Produto():produto;
    }

    @Override
    public String toString() {
        return getValor()+"";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Vendas other = (Vendas) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
 
}
