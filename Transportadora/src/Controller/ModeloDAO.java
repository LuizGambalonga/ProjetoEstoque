
package Controller;
import Controller.DAO;
import Model.Fabricante;
import Model.Modelo;



import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class ModeloDAO extends DAO<Modelo>{
    
    public List<Modelo> getAll(){
        String HQL = "select m from Modelo m order by m.descricao";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Modelo> getAll(String filtro){
     return this.getAll().stream().filter(
        M -> M.getDescricao().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
