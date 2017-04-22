/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cifra.modelo.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Everson
 */
@Entity
@NamedQueries({   
         @NamedQuery(name = "Cifra.consultarTodos",
            query = "SELECT c FROM Cifra c INNER JOIN c.artista a WHERE a.id = :id ORDER BY c.titulo"),        
         @NamedQuery(name = "Cifra.consultarPorLetra",
            query = "SELECT c FROM Cifra c INNER JOIN c.artista a WHERE a.id = :id AND c.titulo LIKE :letra ORDER BY c.titulo")        
              
})
public class Cifra implements EntidadeBase, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String titulo;
    @ManyToOne    
    private Artista artista;
    private String conteudo;
    private int audiencia;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getAudiencia() {
        return audiencia;
    }

    public void setAudiencia() {
        audiencia ++;
    }
    
    

    
     
}
