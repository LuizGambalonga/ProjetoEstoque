
package Controller;
import Controller.DAO;
import Model.PedidoCompra;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;


public class PedidoCompraDAO extends DAO<PedidoCompra>{
    
    public List<PedidoCompra> getAll(){
        String HQL = "select p from PedidoCompra p order by p.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<PedidoCompra> getAll(String filtro){
      return this.getAll().stream().filter(
        ve -> ve.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
