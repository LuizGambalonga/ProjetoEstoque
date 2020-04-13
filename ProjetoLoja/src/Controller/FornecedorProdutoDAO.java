
package Controller;
import Controller.DAO;
import Model.Fornecedor;
import Model.FornecedorProduto;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Query;

public class FornecedorProdutoDAO extends DAO<FornecedorProduto>{
    
    public List<FornecedorProduto> getAll(){
        String HQL = "select fo from FornecedoProduto fo order by fo.nome";
        return super.getAll(HQL);
    }
    //com filtro
     public List<FornecedorProduto> getAll(String filtro){
      return this.getAll().stream().filter(
        fo -> fo.getNome().contains(
        filtro.toUpperCase())).collect(Collectors.toList());
    }
}
