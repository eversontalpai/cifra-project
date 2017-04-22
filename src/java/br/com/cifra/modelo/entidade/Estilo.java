/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cifra.modelo.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Everson
 */
@Entity
public class Estilo implements EntidadeBase, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_estilo",unique = true, nullable = false)
    private String nomeEstilo;
    @ManyToMany(mappedBy = "estilos")
    private List<Artista> artistas;

   
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEstilo() {
        return nomeEstilo;
    }

    public void setNomeEstilo(String nomeEstilo) {
        this.nomeEstilo = nomeEstilo;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
    
    
}
