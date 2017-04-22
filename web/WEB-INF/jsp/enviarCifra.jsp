<%-- 
    Document   : enviarCifra
    Created on : 20/06/2016, 21:38:50
    Author     : Everson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="cabecalho.jsp" %>
<%@include file="menu.jsp" %>

   <div class="row">
    <div class="span12">
        <hr>
    </div>
    <div class="row page-header">
        <div class="span5 offset5">
            <h2 class="into-text text-center">
                        <strong>Enviar Cifra</strong>
                    </h2>
                  
            </div>
        </div>
    </div>

    <form action="cadastrarCifras" method="POST">

        <div class="row">
            
            <div class="form-group span4 offset5">
                <label>Título</label>
                <input type="text" class="form-control" name="titulo" required="">
            </div>
        </div>
        <div class="row">
             
            <div class="form-group span4 offset5">
                <label>Artista</label>
                <input type="text" name="artista" class="form-control" value="${artista.nomeArtista}" disabled="">
            </div>
        </div>
        <div class="row">
             
            <div class="span10 offset5">
                <label>Conteudo</label>
                <textarea rows="10" cols="100" name="conteudo" required="">Digite a sua cifra aqui</textarea>
            </div>
        </div>
       
        <div class="row">
             
            <div class="form-group span1 offset5">
                <input type="submit" class="btn btn-success text-center" value="Enviar">  
            </div>
              <div class="form-group span1 offset">
                  <a href="r?page=index"> <input type="button" class="btn btn-danger text-center" value="Cancelar"></a>  
            </div>
        </div>
        
        <div class="row">
            <div class="form-group span4 offset5">
                <c:if test="${not empty msg}">
                    <h4>${msg}</h4>  
                </c:if>
            </div>
        </div>
    </form> 





    
   

<%@include file="rodape.jsp" %>
