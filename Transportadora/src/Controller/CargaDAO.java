
package Controller;
import Controller.DAO;
import Model.Carga;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;



public class CargaDAO extends DAO<Carga>{
   public List<Carga> getAll(){
        String HQL = "select car from Carga car order by car.motorista";
        return super.getAll(HQL);
    }
    //com filtro
     public List<Carga> getAll(String filtro){
     return this.getAll().stream().filter(
       car -> car.getMotorista().contains(
       filtro.toUpperCase())).collect(Collectors.toList());
    }
}