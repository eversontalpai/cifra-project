/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cifra.modelo.dao;

import br.com.cifra.modelo.entidade.Artista;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Everson
 */
public class ArtistaDAO extends DaoGenerico<Artista>{
    
     public List<Artista> consultarTodas(){
        EntityManager em = getEM();
        List<Artista> lista; 
        try {            
            Query q = em.createNamedQuery("Artista.consultarTodos");
            lista = q.getResultList();
        } catch (Exception e) {
            lista= new ArrayList();
        }finally{
            em.close();
        }
        
        return lista;
    }
     public List<Artista> consultarPorLetra(char letra){
        EntityManager em = getEM();
        List<Artista> lista; 
        try {            
            Query q = em.createNamedQuery("Artista.consultarPorLetra");
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
