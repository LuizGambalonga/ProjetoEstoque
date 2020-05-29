
package Model;

import java.util.Objects;
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
@Table(name = "ESTADO")
public class Estado implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
    private Integer id;
    //
    @Column(name = "NOME",length = 50,nullable = false)
    @SwingColumn(description = "NOME",colorOfBackgound = "")
    private String nome;
    //
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="ID_PAIS",referencedColumnName = "ID")
    private Pais pais;
    //FIM
    public Estado() {
     this.setId(0);
     this.setPais(null);
    }

    public Estado(Integer id,String nome,Pais pais) {
      this.setId(id);
      this.setNome(nome);
      this.setPais(pais);
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id<0?0:id;
    }

    public String getNome() {
        return  this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public Pais getPais() {
        return  this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais == null? new Pais():pais;
    }

    @Override
    public String toString() {
        return getNome();
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
