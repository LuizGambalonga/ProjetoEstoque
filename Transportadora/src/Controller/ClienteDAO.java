
package Controller;
import Controller.DAO;
import Model.Cliente;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class ClienteDAO extends DAO<Cliente>{
    
    public List<Cliente> getAll(){
        String HQL = "select cli from Cliente cli order by cli.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Cliente> getAll(String filtro){ 
         return this.getAll().stream().filter(
        c -> c.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
