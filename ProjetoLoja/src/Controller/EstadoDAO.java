
package Controller;
import Controller.DAO;
import Model.Estado;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class EstadoDAO extends DAO<Estado>{
    
    public List<Estado> getAll(){
        String HQL = "select e from Estado e order by e.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Estado> getAll(String filtro){
      return this.getAll().stream().filter(
        e -> e.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
