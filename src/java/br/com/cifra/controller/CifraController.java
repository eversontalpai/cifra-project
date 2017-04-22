/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cifra.controller;

import br.com.cifra.modelo.dao.ArtistaDAO;
import br.com.cifra.modelo.dao.CifraDAO;
import br.com.cifra.modelo.dao.DaoGenerico;
import br.com.cifra.modelo.entidade.Artista;
import br.com.cifra.modelo.entidade.Cifra;
import br.com.cifra.modelo.entidade.Usuario;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Everson
 */
@Controller
public class CifraController {
    
    
    @RequestMapping("index")
    public String index(){
        
        return "index";
    }
    @RequestMapping("/r")
    public String redirect(String page){
        
        return page;
    }
    
    @RequestMapping("/cadastrar")
    public String cadastrarUsuario(Model model, Usuario user, String tSenha){
        DaoGenerico dao = new DaoGenerico();
        String resposta;
        if(!user.getSenha().equals(tSenha)){
            resposta = "Senhas não conferem!!!";
            model.addAttribute("nome", user.getNome());
            model.addAttribute("email", user.getEmail());
           }else{
        resposta = dao.inserir(user);
        }
        model.addAttribute("msg", resposta);
        
        return "cadastro";
     }
    
    

    @RequestMapping("/artistas")
    public String artistas(Model model, char letra){
       
        ArtistaDAO dao = new ArtistaDAO();
        List<Artista> resposta;
        resposta = dao.consultarPorLetra(letra);
                
        model.addAttribute("resposta",resposta);  
        model.addAttribute("letra",letra);  
        
        
        return "artistas"; 
    }
    
    @RequestMapping("/cifras")
    public String artistaCifras(Model model, int id, HttpSession session){
        ArtistaDAO adao = new ArtistaDAO();
        CifraDAO dao = new CifraDAO();
        Artista artista = adao.buscarPorId(Artista.class, id);
        List<Cifra> resposta;
        resposta = dao.consultarTodas(id);       
        artista.setAudiencia();
        adao.editar(artista);
           
            
            session.setAttribute("artista", artista);
            
        model.addAttribute("resposta",resposta);  
       
        
        return "cifrasArtista"; 
    }
//    @RequestMapping("/cifrasLetra")
//    public String artistaCifrasLetras(Model model,char letra, int id){
//       
//        CifraDAO dao = new CifraDAO();
//        List<Cifra> resposta;
//        resposta = dao.consultarPorLetra(letra, id);
//        String nome = null;
//        int idArtista = 0;
//        for(Cifra ci : resposta){
//            nome = ci.getArtista().getNomeArtista();
//            idArtista = ci.getArtista().getId();
//        }
//        
//        model.addAttribute("resposta",resposta);  
//        model.addAttribute("nome",nome.toUpperCase());  
//        //model.addAttribute("id",idArtista);  
//        
//        
//        return "cifrasArtista"; 
//    }
       @RequestMapping("/enviarCifra")
    public String enviar(HttpSession session){
      
             
        return "enviarCifra"; 
    }
    
    @RequestMapping("/cadastrarCifras")
    public String cadastrarCifras(Model model,Cifra cifra, HttpSession session){
       
       
        CifraDAO dao = new CifraDAO();
        Artista artista = (Artista)session.getAttribute("artista");       
        cifra.setArtista(artista);
         String texto = cifra.getConteudo();
         String conteudo="";
         
        String[] split = texto.split("/");
        
        for(String s : split){
            conteudo += "<p>"+s+"</p>";
        }
        
        cifra.setConteudo(conteudo);
        
        String resposta = dao.inserir(cifra);
        
        
        
        model.addAttribute("msg",resposta);  
        
        
        
        return "enviarCifra"; 
    }
    
     @RequestMapping("/cifra")
    public String Cifras(int id, HttpSession session){
        
        CifraDAO dao = new CifraDAO();
       
        Cifra cifra = dao.buscarPorId(Cifra.class, id) ;       
        cifra.setAudiencia();
        dao.editar(cifra);
                   
        session.setAttribute("cifra", cifra);     
       
       
        
        return "exibirCifra"; 
    }
    
    
    
    
}
