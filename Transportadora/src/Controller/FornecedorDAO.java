
package Controller;
import Controller.DAO;
import Model.Fornecedor;


import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class FornecedorDAO extends DAO<Fornecedor>{
    
    public List<Fornecedor> getAll(){
        String HQL = "select f from Fornecedor f order by f.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Fornecedor> getAll(String filtro){
      return this.getAll().stream().filter(
        f -> f.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
