
package Controller;
import Controller.DAO;
import Model.Produto;
import Model.Vendedores;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class ProdutoDAO extends DAO<Produto>{
    
    public List<Produto> getAll(){
        String HQL = "select p from Produto p order by p.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Produto> getAll(String filtro){
      return this.getAll().stream().filter(
        p -> p.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
