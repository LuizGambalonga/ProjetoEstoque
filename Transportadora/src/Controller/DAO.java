
package Controller;

import Banco.Dados;

import java.util.List;
import javax.persistence.Query;

abstract public class DAO<T>{
     public void add(T object){
        Banco.Dados.getManager().getTransaction().begin();
        Banco.Dados.getManager().persist(object);
        Banco.Dados.getManager().getTransaction().commit();
    }
    
     public void update(T object){
        Banco.Dados.getManager().getTransaction().begin();
        Banco.Dados.getManager().merge(object);
        Banco.Dados.getManager().getTransaction().commit();
    }
    
     public T get(Class<T> classType ,int pk){
        return Banco.Dados.getManager().find(classType, pk);    
     }
     
    public void remove(T object){
        Banco.Dados.getManager().getTransaction().begin();
        Banco.Dados.getManager().remove(object);
        Banco.Dados.getManager().getTransaction().commit();
    }
    // sem parametro
    public List<T>getAll(String HQL){
        Query query = Banco.Dados.getManager().createQuery(HQL);
        return query.getResultList();
    }
    //com parametro
    public List<T>getAll(String HQL,Object... args){
        Query query = Banco.Dados.getManager().createQuery(HQL);
        for(int i=0; i<args.length; i++){
            query.setParameter(i+1, args[i]);
        }
        return query.getResultList();
    }
}
