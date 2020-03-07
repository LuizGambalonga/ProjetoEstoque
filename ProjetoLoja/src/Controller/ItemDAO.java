
package Controller;

import Model.Vendas;
import Model.Item;
import java.util.List;
import javax.persistence.Query;

public class ItemDAO extends DAO<Item>{
    public List<Item> getAll(){
        String HQL="select i from Item i order by i.vendas.valor";
        return super.getAll(HQL);
    }
    //servir para filtrar as vendas relacionada a cada produto // ITEMS
    public List<Item> getAll(Vendas vendas){
        String HQL="select i from Item i where "
                + "i.vendas = ?1 order by i.produto.nome";
        Query query = Banco.Dados.getManager().createQuery(HQL);
        query.setParameter(1, vendas);
        return query.getResultList();

    }
    
    
    
    
}
