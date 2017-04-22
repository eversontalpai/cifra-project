
import br.com.cifra.modelo.dao.DaoGenerico;
import br.com.cifra.modelo.entidade.Artista;
import br.com.cifra.modelo.entidade.Cifra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everson
 */
public class teste {
    public static void main(String[] args) {
//        Usuario user = new Usuario();
//        user.setNome("João123");
//        user.setEmail("joao23@teste.com");
//        user.setSenha("abc");
//        user.setIsAdm(0);
//        
//        DaoGenerico dao = new DaoGenerico();
//        Artista a;
//        
//        for (int i = 0; i < 10; i++) {
//            a = new Artista();
//            a.setImagem("resources/Imagens/icon.jpg");
//            a.setNomeArtista("Artista "+i);
//            a.setInformacoes("info fdgsdfgdsfgvdfgfghvdghbghjfynbdgvrdtgcsdgvhfbvfscfvsd "+i);
//            
//             System.out.println(dao.inserir(a));
//            
//        }
//        DaoGenerico dao = new DaoGenerico();
//        Artista a;
//        
//       
//            a = new Artista();
//            a.setId(11);
//            a.setImagem("resources/Imagens/mamonas.jpg");
//            a.setNomeArtista("Mamonas Assassinas");
//            a.setInformacoes("Mamonas Assassinas, anteriormente chamada de Utopia, foi uma banda brasileira de rock cômico formada em Guarulhos em 1990.<a href=\"https://www.google.com.br/url?sa=t&rct=j&q=&esrc=s&source=web&cd=14&cad=rja&uact=8&ved=0ahUKEwifj86loufQAhXCg5AKHSyUBvEQmhMIiwEwDQ&url=http%3A%2F%2Fpt.wikipedia.org%2Fwiki%2FMamonas_Assassinas&usg=AFQjCNEbbXoM5LiRr175g61b7wGfUiYwRw&sig2=2aEzGFV6zZsUm1KRm8o_ew\">Wikipédia</a> ");
//            
//             System.out.println(dao.editar(a));
//            
        
        
//        DaoGenerico dao = new DaoGenerico();
//        Artista a;
//        List<Cifra> cifras = new ArrayList();
////          a.setNomeArtista("Testea");
////          a.setInformacoes("info");
//
//        a = (Artista)dao.buscarPorId(Artista.class, 12);
//          Cifra c;
//        for (int i = 0; i < 10; i++) {
//            c = new Cifra();
//           c.setTitulo("Musica"+(i+1));
//           c.setArtista(a);
//           c.setConteudo("dsafhkjhdsakjhfsdkjahfkjsdhafkjhsdkjfhdskjhfjkdsh");
//            
//           cifras.add(c);
//                    
//      //  }
//       // a.setCifras(cifras);
//        
//       //  System.out.println(dao.inserir(a));
//        System.out.println(dao.inserir(c));
//        
//        }
      //  System.out.println(dao.existe(user));
        
//         ArtistaDAO dao = new ArtistaDAO();
//         
//         List<Artista> lista = dao.consultarPorLetra('b');
//         
//         for(Artista a : lista){
//             System.out.println(a.getNomeArtista());   
//         }
//         
//         CifraDAO dao = new CifraDAO();
//         
//         List<Cifra> lista = dao.consultarTodas(53);
//         
//         for(Cifra c : lista){
//             System.out.println(c.getTitulo());   
//         }
//    

    DaoGenerico dao = new DaoGenerico();
            
    
            Cifra c;
            Artista a = (Artista) dao.buscarPorId(Artista.class, 11);
            c = new Cifra();
           c.setTitulo("Robocop Gay");
           c.setArtista(a);
           c.setConteudo("                C/\n" +
"Um tanto quanto másculo/\n" +
"               G/\n" +
"Ai, com \"M\" maiúsculo/\n" +
"\n//" +
"Vejam só os meus músculos/\n" +
"                   C/\n" +
"Que com amor cultivei/\n" +
"                    //\n" +
"Minha pistola é de plástico/ \n" +
"//\n" +
"(quero chupar, pa, pa)/\n" +
"              G/\n" +
"Em formato cilíndrico/ \n" +
"//\n" +
"(quero chupar, pa)/\n" +
"//\n" +
"Sempre me chamam de cínico/ \n" +
"//\n" +
"(quero chupaaar)/\n" +
"                     C/\n" +
"Mas o porquê eu não sei /\n" +
"//\n" +
"(quero chupar, pa)/\n" +
"//\n" +
"                   C/\n" +
"O meu bumbum era flácido/\n" +
"                        G/\n" +
"Mas esse assunto é tão místico/\n" +
"//\n" +
"Devido a um ato cirúrgico/\n" +
"                    C/\n" +
"Hoje eu me transformei/\n" +
" //\n" +
"O meu andar é erótico /\n" +
"//\n" +
"(silicone, yeah, yeah, yeah)/\n" +
"                 G/\n" +
"Com movimentos atômicos /\n" +
"//\n" +
"(silicone, yeah, yeah)/\n" +
"\n" +
"Sou um amante robótico\n" +
"//\n" +
"(silicone, yeaaah)/\n" +
"                  C/\n" +
"Com direito a replay /\n" +
"//\n" +
"(silicone, yeah!)/              C/\n" +
"Um ser humano fantástico/\n" +
"               G/\n" +
"Com poderes titânicos/\n" +
"//\n" +
"Foi um moreno simpático/\n" +
"                   C/\n" +
"Por quem me apaixonei/\n" +
"//\n" +
"E hoje estou tão eufórico /\n" +
" //\n" +
"(doce, doce, amor)/\n" +
"                  G/\n" +
"Com mil pedaços biônicos /\n" +
"//\n" +
"(doce, doce, amor)/\n" +
"                /\n" +
"Ontem eu era católico /\n" +
"//\n" +
"(doce, doce, amor)/\n" +
"                    C5/\n" +
"Ai, hoje eu sou um gay!/\n" +
"//\n" +
"( C5  G5  A5  F5 )/"
                   + "/Refrão:\n" +
"//\n" +
"          C5/\n" +
"Abra sua mente/\n" +
"              G5/\n" +
"Gay também é gente/\n" +
"               A5/\n" +
"Baiano fala \"oxente\"/\n" +
"            F5/\n" +
"E come vatapá/\n" +
"//\n" +
"               C5/\n" +
"Você pode ser gótico/\n" +
"                 G5/\n" +
"Ser punk ou skinhead/\n" +
"                   A5/\n" +
"Tem gay que é Mohamed/\n" +
"               F5/\n" +
"Tentando camuflar/\n" +
"//\n" +
"Alá, meu bom Alá/\n" +
"//\n" +
"            C5/\n" +
"Faça bem a barba/\n" +
"                G5/\n" +
"Arranque seu bigode/\n" +
"               A5/\n" +
"Gaúcho também pode/\n" +
"                F5/\n" +
"Não tem que disfarçar/\n" +
"//\n" +
"           C5/\n" +
"Faça uma plástica/\n" +
"               G5/\n" +
"Ai entre na ginástica/\n" +
"             A5/\n" +
"Boneca cibernética/\n" +
"            F5/\n" +
"Um robocop gay/\n" +
"           C5/\n" +
"Um robocop    gay/\n" +
"            G5/\n" +
"Um robocop gay/\n" +
"                A5/\n" +
"Ai, eu sei, eu sei/\n" +
"             F5  C5/\n" +
"Meu robocop gay/\n" +
"/\n" +
"Ai como dói!/\n" +
"");
     String texto = c.getConteudo();
         String conteudo="";
         
        String[] split = texto.split("/");
        
        for(String s : split){
            conteudo += "<p>"+s+"</p>";
        }
        
        c.setConteudo(conteudo);
dao.inserir(c);
                
                
    
}
}
