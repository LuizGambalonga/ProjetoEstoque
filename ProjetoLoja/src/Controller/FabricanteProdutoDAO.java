
package Controller;
import Controller.DAO;
import Model.Fabricante;
import Model.FabricanteProduto;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class FabricanteProdutoDAO extends DAO<FabricanteProduto>{
    
    public List<FabricanteProduto> getAll(){
        String HQL = "select f from FabricanteProduto f order by f.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<FabricanteProduto> getAll(String filtro){
     return this.getAll().stream().filter(
        f -> f.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
