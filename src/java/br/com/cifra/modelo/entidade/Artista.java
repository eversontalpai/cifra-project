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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Everson
 */
@Entity
@NamedQueries({   
         @NamedQuery(name = "Artista.consultarTodos",
            query = "SELECT a FROM Artista a"),        
         @NamedQuery(name = "Artista.consultarPorLetra",
            query = "SELECT a FROM Artista a WHERE a.nomeArtista LIKE :letra ORDER BY a.nomeArtista")        
              
})
public class Artista implements EntidadeBase, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imagem;
    @Column(name = "nome_artista", unique = true, nullable = false)
    private String nomeArtista;
    private String informacoes;
    @ManyToMany
    @JoinTable(name = "artista_estilo", joinColumns = @JoinColumn(name = "artista_id"), inverseJoinColumns = @JoinColumn(name = "estilo_id"))
    private List<Estilo> estilos;
    @OneToMany
    @JoinTable(name = "artista_cifra", joinColumns = @JoinColumn(name = "artista_id"), inverseJoinColumns = @JoinColumn(name = "cifra_id"))
    private List<Cifra> cifras;
    private int audiencia;

    
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista.toUpperCase();
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    

    public List<Cifra> getCifras() {
        return cifras;
    }

    public void setCifras(List<Cifra> cifras) {
        this.cifras = cifras;
    }

    public List<Estilo> getEstilos() {
        return estilos;
    }

    public void setEstilos(List<Estilo> estilos) {
        this.estilos = estilos;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getAudiencia() {
        return audiencia;
    }

    public void setAudiencia() {
        audiencia ++;
    }

    

}
