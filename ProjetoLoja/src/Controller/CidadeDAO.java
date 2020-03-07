
package Controller;
import Controller.DAO;
import Model.Cidade;


import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class CidadeDAO extends DAO<Cidade>{
    
    public List<Cidade> getAll(){
        String HQL = "select c from Cidade c order by c.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Cidade> getAll(String filtro){
     return this.getAll().stream().filter(
       c -> c.getNome().contains(
       filtro.toUpperCase())).collect(Collectors.toList());
    }
}
