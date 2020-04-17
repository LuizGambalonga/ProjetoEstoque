
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
    @Column(name = "placa",length = 7,nullable = false)
    @SwingColumn(description = "placa",colorOfBackgound = "")
    private String placa;
    //
    @Column(name = "Frete",length = 10,nullable = false)
    @SwingColumn(description = "Frete",colorOfBackgound = "")
    private Double frete;
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
    @JoinColumn(name = "ID_FORNECEDOR_PRODUTO",referencedColumnName = "ID")
    private FornecedorProduto fornecedorproduto;
    // buscou a foreign fabricante
    @ManyToOne(fetch =FetchType.LAZY )
    @SwingColumn(description = "Fabricante",colorOfBackgound = "")
    @JoinColumn(name = "ID_FABRICANTE_PRODUTO",referencedColumnName = "ID")
    private FabricanteProduto fabricanteproduto;
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
    public Carga() {
     this.setId(0);
     this.setPlaca("AAA-0000");
     this.setFrete(0.01);
     this.setProduto(null);
     this.setCidade(null);
     this.setEstado(null);
     this.setPais(null);
    }

    public Carga(Integer id,String placa,Double frete,Produto produto,Cliente cliente,FabricanteProduto fabricanteproduto,FornecedorProduto fornecedorproduto,Cidade cidade ,Estado estado,Pais pais) {
      this.setId(id);
      this.setPlaca(placa);
      this.setFrete(frete);
      this.setProduto(produto);
      this.setCliente(cliente);
      this.setFornecedorProduto(fornecedorproduto);
      this.setFabricanteProduto(fabricanteproduto);
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
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente==null ? new Cliente():cliente;
    }

    public FornecedorProduto getFornecedorProduto() {
        return fornecedorproduto;
    }

    public void setFornecedorProduto(FornecedorProduto fornecedorproduto) {
        this.fornecedorproduto = fornecedorproduto ==null ? new FornecedorProduto() :fornecedorproduto;
    }

    public FabricanteProduto getFabricanteProduto() {
        return fabricanteproduto;
    }

    public void setFabricanteProduto(FabricanteProduto fabricanteproduto) {
        this.fabricanteproduto = fabricanteproduto == null ? new FabricanteProduto():fabricanteproduto;
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
