
package Controller;
import Controller.DAO;
import Model.Fabricante;


import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class FabricanteDAO extends DAO<Fabricante>{
    
    public List<Fabricante> getAll(){
        String HQL = "select f from Fabricante f order by f.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Fabricante> getAll(String filtro){
     return this.getAll().stream().filter(
        f -> f.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
