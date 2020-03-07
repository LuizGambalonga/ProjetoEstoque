
package Model;

import Enums.Tipo;
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
@Table(name = "LOJAS")
public class Lojas implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
    private int id;
    //
    @Column(name = "NOME",length = 50,nullable = false)
    @SwingColumn(description = "NOME",colorOfBackgound = "")
    private String nome;
    @Column(name = "RAZAO_SOCIAL",length = 80,nullable = false)
    @SwingColumn(description = "RAZAO SOCIAL",colorOfBackgound = "")
    private String razao_social;
    //
    @Column(name = "CNPJ",length = 14,nullable = false)
    @SwingColumn(description = "CNPJ",colorOfBackgound = "")
    private String cnpj;
    //
    @Column(name = "TELEFONE",length = 14)
    private String telefone;
    //
    @Column(name = "ENDERECO",length = 100,nullable = false)
    private String endereco;
    //
    @Column(name = "CEP",length = 10,nullable = false)
    private String cep;
    //
    @Column(name = "TIPO",length = 2,nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    //
    @ManyToOne(fetch =FetchType.LAZY )
    @JoinColumn(name = "ID_ESTADO",referencedColumnName = "ID")
    private Estado estado;
    //
    @ManyToOne(fetch =FetchType.LAZY )
    @JoinColumn(name = "ID_CIDADE",referencedColumnName = "ID")
    private Cidade cidade;
    //
    @ManyToOne(fetch =FetchType.LAZY )
    @JoinColumn(name = "ID_PAIS",referencedColumnName = "ID")
    private Pais pais;
    
    public Lojas(){
    this.setId(0);
    this.setNome("PADRÃO");
    this.setRazao_social("PADRÃO");
    this.setCnpj("000.000.000-00");
    this.setTelefone("000-0000000-00");
    this.setEndereco("PADRÃO");
    this.setCep("00000-000");
    this.setTipo(tipo.VA);
    this.setEstado(null);
    this.setCidade(null);
    this.setPais(null);
    }
    public Lojas(int id,String nome,String razao_social,String cnpj,String telefone,String endereco,String cep,Tipo tipo,Estado estado,Cidade cidade,Pais pais){
    this.setId(id);
    this.setNome(nome);
    this.setRazao_social(razao_social);
    this.setCnpj(cnpj);
    this.setTelefone(telefone);
    this.setEndereco(endereco);
    this.setCep(cep);
    this.setTipo(tipo);
    this.setEstado(estado);
    this.setCidade(cidade);
    this.setPais(pais);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id<0?0:id;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"PADRÃO":nome.toUpperCase();
    }
    
    public void setTipo(Tipo tipo) {
        this.tipo = tipo ==null? Tipo.VA:tipo;
    }
    

    public String getRazao_social() {
        return this.razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social.trim().isEmpty()?"PADRÃO":razao_social.toUpperCase();
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj.length()!=14?"000.000.000-00":cnpj;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado == null ? new Estado():estado;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade == null ? new Cidade():cidade;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais == null ? new Pais():pais;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
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
        final Lojas other = (Lojas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
