
package Controller;
import Controller.DAO;
import Model.Vendedores;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class VendedoresDAO extends DAO<Vendedores>{
    
    public List<Vendedores> getAll(){
        String HQL = "select v from Vendedores v order by v.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Vendedores> getAll(String filtro){
      return this.getAll().stream().filter(
        v -> v.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
