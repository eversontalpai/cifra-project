<%-- 
    Document   : cadastro
    Created on : 18/06/2016, 00:52:27
    Author     : Everson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="cabecalho.jsp" %>
<%@include file="menu.jsp" %>

<div class="container">
    <div class="row">
        <div class="box">
            <div class="col-lg-12">              
                    <hr>
                    <h2 class="intro-text text-center">
                        <strong>Cadastro</strong>
                    </h2>
                    <hr>
            </div>
        </div>
    </div>

    <form action="cadastrar" method="POST">

        <div class="row">            
            <div class="form-group col-lg-4 col-lg-offset-4">
                <label>Nome</label>
                <input type="text" class="form-control" name="nome" required="" value="${nome}">
            </div>
        </div>
        <div class="row">           
            <div class="form-group col-lg-4 col-lg-offset-4">
                <label>Email</label>
                <input type="text" name="email" class="form-control" required="" value="${email}">
            </div>
        </div>
        <div class="row">            
            <div class="form-group col-lg-4 col-lg-offset-4">
                <label>Senha</label>
                <input type="password" name="senha" class="form-control" required="">
            </div>
        </div>
        <div class="row">            
            <div class="form-group col-lg-4 col-lg-offset-4">
                <label>Confirme sua Senha</label>
                <input type="password" name="tSenha" class="form-control" required="">
            </div>
        </div>
        <div class="row">             
            <div class="form-group col-lg-1 col-lg-offset-5">
                <input type="submit" class="btn btn-success text-center" value="Enviar">  
            </div>
              <div class="form-group col-lg-1">
                  <a href="r?page=index"> <input type="button" class="btn btn-danger text-center" value="Cancelar"></a>  
            </div>
        </div>
        
        <div class="row">
            <div class="form-group text-center col-lg-12">
                <c:if test="${not empty msg}">
                    <h4>${msg}</h4>  
                </c:if>
            </div>
        </div>
    </form> 





    <div class="row" >
        <%@include file="topCifra.jsp" %>
        <%@include file="topArtista.jsp" %>      
    </div>
    <div class="row">

    </div>
</div>


<%@include file="rodape.jsp" %>