
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
@Table(name = "FORNECEDOR_PRODUTO")
public class FornecedorProduto implements java.io.Serializable{
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
   @Column(name = "NOME_CONTATO",length = 80,nullable = false)
    @SwingColumn(description = "NOME DE CONTATO",colorOfBackgound = "")
   private String nome_contato;
   //
   @Column(name = "RAZAO_SOCIAL",length = 80,nullable = false)
   @SwingColumn(description = "RAZAO SOCIAL",colorOfBackgound = "")
   private String razao_social;
   //
   @Column(name = "CNPJ",length = 14,nullable = false)
   private String cnpj;
   //
   @Column(name = "ENDERECO",length = 100,nullable = false)
   private String endereco;
   //
   @Column(name = "CEP",length = 14,nullable = false)
   private String cep;
   //
   @Column(name = "TELEFONE",length = 14)
   private String telefone;
   //
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ID_CIDADE",referencedColumnName = "ID")
   private Cidade cidade; 
   //
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ESTADO",referencedColumnName = "ID")
    private Estado estado;
    //
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAIS",referencedColumnName = "ID")
    private Pais pais;
    //FIM
   public FornecedorProduto(){
   this.setId(0);
   this.setNome("PADRÃO");
   this.setNome_contato("PADRÃO");
   this.setRazao_social("PADRÃO");
   this.setCnpj("000.000.000-00");
   this.setEndereco("PADRÃO");
   this.setCep("00000-000");
   this.setTelefone("(00)00000-0000");
   this.setCidade(null);
   this.setEstado(null);
   this.setPais(null);
   }
    public FornecedorProduto(Integer id,String nome,String nome_contato,String razao_social,String cnpj,String endereco,String cep,String telefone,Cidade cidade,Estado estado,Pais pais){
    this.setId(id);
    this.setNome(nome);
    this.setNome_contato(nome_contato);
    this.setRazao_social(razao_social);
    this.setCnpj(cnpj);
    this.setEndereco(endereco);
    this.setCep(cep);
    this.setTelefone(telefone);
    this.setCidade(cidade);
    this.setEstado(estado);
    this.setPais(pais);
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
        this.nome = nome.trim().isEmpty()?"PADRÃO":nome.toUpperCase();
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato.trim().isEmpty()?"PADRÃO":nome_contato.toUpperCase();
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj.length()!=14?"000.000.000-00":cnpj;
    }

    public String getRazao_social() {
        return this.razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social.trim().isEmpty()?"PADRÃO":razao_social.toUpperCase();
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty()?"PADRÃO":endereco.toUpperCase();
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep.length()!=10?"00000-000":cep;
    }

    public String getTelefone() {
        return this.telefone;
    }
     // pode ser nulo
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado == null? new Estado():estado;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais == null ? new Pais():pais;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade ==null? new Cidade():cidade;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final FornecedorProduto other = (FornecedorProduto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
