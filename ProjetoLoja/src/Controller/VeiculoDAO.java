
package Controller;
import Controller.DAO;
import Model.Produto;
import Model.Veiculo;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class VeiculoDAO extends DAO<Veiculo>{
    
    public List<Veiculo> getAll(){
        String HQL = "select v from Veiculo v order by v.placa";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Veiculo> getAll(String filtro){
      return this.getAll().stream().filter(
        v -> v.getPlaca().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
