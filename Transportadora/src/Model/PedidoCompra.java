package Model;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PedidoCompra")
public class PedidoCompra implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
    private Integer id;
    //
    @Column(name = "SIGLA",length = 3,nullable = false)
    @SwingColumn(description = "SIGLA",colorOfBackgound = "")
    private String sigla;
    //fim  
    
    public PedidoCompra(){
     this.setId(0);
    }
    public PedidoCompra(Integer id,String sigla){ 
      this.setId(id);
      this.setSigla(sigla);
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla.toUpperCase();
    }

    @Override
    public String toString() {
        return getSigla();
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
