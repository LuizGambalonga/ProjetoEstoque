
package Controller;
import Controller.DAO;
import Model.Veiculo;
import Model.Carga;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;



public class CargaDAO extends DAO<Carga>{
   public List<Carga> getAll(){
        String HQL = "select c from Carga c order by c.veicuo";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Carga> getAll(String filtro){
     return this.getAll().stream().filter(
       c -> c.getVeiculo().contains(
       filtro.toUpperCase())).collect(Collectors.toList());
    }
}