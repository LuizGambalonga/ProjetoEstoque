
package Controller;
import Controller.DAO;
import Model.Produto;
import Model.Veiculo;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class VeiculoDAO extends DAO<Veiculo>{
    
    public List<Veiculo> getAll(){
        String HQL = "select ve from Veiculo ve order by ve.placa";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Veiculo> getAll(String filtro){
      return this.getAll().stream().filter(
        ve -> ve.getPlaca().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
