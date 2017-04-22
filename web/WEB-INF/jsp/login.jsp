<%-- 
    Document   : login
    Created on : 20/06/2016, 18:35:24
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
            <div class="span2 offset5">
            <h2 class="into-text text-center">
                Entrar
            </h2>
            </div> 
        </div>    
        <div class="offset2">
    <form class="form-horizontal" action="Controlador?class=LogicaControladoraLogin" method="POST">
    <div class="row"> 
        <div class="span6">
            <div class="control-group">
                <label class="control-label">Email</label>
                <div class="controls">
                <input type="text" placeholder="Email" name="login" required="">
                </div>
        </div>
        </div>
    </div>
        
        <div class="row"> 
             <div class="span6">
            <div class="control-group">
                 <label class="control-label">Senha</label>
                 <div class="controls">
                 <input type="password" placeholder="Senha" name="senha" required="">            
                 </div>
         </div>
        </div>
        </div>
        
        <div class="row">
        <div class="grid1">            
            <div class="control-group">
                <div class="controls">
            <input type="submit" class="text-center btn btn-success" value="Entrar">
             <a href="r?page=index"> <input type="button" class="text-center btn btn-danger text-center" value="Cancelar"></a>
            </div>
            </div>    
                 
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
        </div>
    <div class="row">
        <div class="form-group text-center span1 offset3"></div>
    <p> Ainda não esta cadastrado?
        não perca tempo <a href="r?page=cadastro">Cadastre-se</a></p>
    </div>
</div>

<%@include file="rodape.jsp" %>