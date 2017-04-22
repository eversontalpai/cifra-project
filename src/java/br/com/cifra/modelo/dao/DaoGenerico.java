/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cifra.modelo.dao;

import br.com.cifra.modelo.entidade.EntidadeBase;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Everson
 * @param <T>
 */
public class DaoGenerico<T extends EntidadeBase>{
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CifraPU");
        return factory.createEntityManager();
    }
    
    public String inserir(T t){
        EntityManager em = getEM();
        String retorno;
        
        try {
         em.getTransaction().begin();
         em.persist(t);
         em.getTransaction().commit();
         retorno = "Salvo com Sucesso!!!";
        } catch (Exception e) {
            retorno = "Falha ao Salvar pela Exceção: "+e;
        }finally{
            em.close();
        }       
        return retorno; 
    }
    
    public String editar(T t){
          EntityManager em = getEM();
        String retorno = null;
         try {
            em.getTransaction().begin();
            if(!em.contains(t)){
                if(em.find(t.getClass(), t.getId())== null){
                    retorno ="Erro ao atualizar";
                }else{
                 em.merge(t);
                  retorno = "Atualizado com Sucesso!!!";
                }
            }
           
            em.getTransaction().commit();
           

        } catch (Exception e) {
            retorno = "Falha ao atualizar pela Exceceção: " + e;
        } finally {
            em.close();
        }
        return retorno;
    }
     public String deletar(Class<T> clss, int id){
         EntityManager em = getEM();
        String retorno = null;
        T t = em.find(clss, id);
         try {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
            retorno = "Excluído com Sucesso!!!";

        } catch (Exception e) {
            retorno = "Falha ao Excluir pela Exceceção: " + e;
        } finally {
            em.close();
        }
        
        return retorno;
    }
     public T buscarPorId(Class<T> clss, int id){
         EntityManager em = getEM();
        T t = null;
        try{
           t = em.find(clss, id);        
        }finally{
            em.close();
            
        }
        return t;
    }
    
//     public boolean existe(T t){
//         EntityManager em = getEM();        
//        boolean rtn;
//        try{
//           
//        }finally{
//            em.close();            
//        }
//        return rtn;
//    }
//    
}
