/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cifra.modelo.dao;

import br.com.cifra.modelo.entidade.Artista;
import br.com.cifra.modelo.entidade.Cifra;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Everson
 */
public class CifraDAO extends DaoGenerico<Cifra>{
    
     public List<Cifra> consultarTodas(int id){
        EntityManager em = getEM();
        List<Cifra> lista; 
        try {            
            Query q = em.createNamedQuery("Cifra.consultarTodos");
             q.setParameter("id", id);
            lista = q.getResultList();
        } catch (Exception e) {
            lista= new ArrayList();
        }finally{
            em.close();
        }
        
        return lista;
    }
     public List<Cifra> consultarPorLetra(char letra, int id){
        EntityManager em = getEM();
        List<Cifra> lista; 
        try {            
            Query q = em.createNamedQuery("Cifra.consultarPorLetra");
            q.setParameter("id", id);
            q.setParameter("letra", letra+"%");
            lista = q.getResultList();
        } catch (Exception e) {
            lista= new ArrayList();
        }finally{
            em.close();
        }
        
        return lista;
    }
}
