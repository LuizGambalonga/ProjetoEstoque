
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
@Table(name = "MODELO")
public class Modelo implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
     @SwingColumn(description = "CÓDIGO",colorOfBackgound = "")
    private Integer id;
    //
    @Column(name = "CODIGO",length = 11,nullable = false)
     @SwingColumn(description = "CÓD.MODELO",colorOfBackgound = "")
    private Integer codigo;
    //
    @Column(name = "DESCRICAO",length = 100,nullable = false)
     @SwingColumn(description = "DESCRIÇÃO",colorOfBackgound = "")
    private String descricao;
    //
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FABRICANTE",referencedColumnName = "ID")
    private Fabricante fabricante;
    //fim
    public Modelo(){
    this.setId(0);
    this.setFabricante(null);
    }
    public Modelo(Integer id,Integer codigo,String descricao,Fabricante fabricante){
    this.setId(id);
    this.setCodigo(codigo);
    this.setDescricao(descricao);
    this.setFabricante(fabricante);
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante == null? new Fabricante():fabricante;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.toUpperCase();
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Modelo other = (Modelo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
