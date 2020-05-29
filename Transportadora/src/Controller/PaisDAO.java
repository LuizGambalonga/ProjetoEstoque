
package Controller;
import Controller.DAO;
import Model.Pais;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class PaisDAO extends DAO<Pais>{
    
    public List<Pais> getAll(){
        String HQL = "select p from Pais p order by p.sigla";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Pais> getAll(String filtro){
      return this.getAll().stream().filter(
        p -> p.getSigla().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
