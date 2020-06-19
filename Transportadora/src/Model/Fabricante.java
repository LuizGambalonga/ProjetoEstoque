
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
@Table(name = "FABRICANTE")
public class Fabricante implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    @SwingColumn(description = "CODIGO",colorOfBackgound = "")
    private Integer id;
    //
    @Column(name = "NOME",length = 100,nullable = false)
    @SwingColumn(description = "NOME",colorOfBackgound = "")
    private String nome;
    //
    @Column(name = "CODIGO",length = 11,nullable = false)
    @SwingColumn(description = "COD.FABRICANTE",colorOfBackgound = "")
    private Integer codigo;
    //
    @Column(name = "RAZAO_SOCIAL",length = 80,nullable = false)
     @SwingColumn(description = "RAZAO SOCIAL",colorOfBackgound = "")
    private String razao_social;
    //
    @Column(name = "NOME_CONTATO",length = 50,nullable = false)
    private String nome_contato;
    //
    @Column(name = "CNPJ", length = 14,nullable = false)
    private String cnpj;
    //
    @Column(name = "ENDERECO",length = 50,nullable = false)
    private String endereco;
    //
    @Column(name = "CEP",length = 8,nullable = false)
    private String cep;
    //
    @Column(name = "TELEFONE",length = 14)
    private String Telefone;
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
    public Fabricante(){
    this.setId(0);
    this.setCidade(null);
    this.setEstado(null);
    this.setPais(null);
    
    }
    public Fabricante(Integer id,String nome,Integer codigo,String razao_social,String nome_contato,String cnpj, String endereco,String cep,String Telefone,Cidade cidade,Estado estado,Pais pais){
    this.setId(id);
    this.setNome(nome);
    this.setCodigo(codigo);
    this.setRazao_social(razao_social);
    this.setNome_contato(nome_contato);
    this.setCnpj(cnpj);
    this.setEndereco(endereco);
    this.setCep(cep);
    this.setTelefone(Telefone);
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

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRazao_social() {
        return this.razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social.trim().toUpperCase();
    }

    public String getNome_contato() {
        return this.nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato.toUpperCase();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado ==null ? new Estado():estado;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais ==null ? new Pais():pais;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.toUpperCase();
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return this.Telefone;
    }
    // pode ser nulo
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade ==null ? new Cidade():cidade;
    }

    @Override
    public String toString() {
        return getNome();
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Fabricante other = (Fabricante) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
