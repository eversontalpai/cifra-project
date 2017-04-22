<%-- 
    Document   : index
    Created on : 17/06/2016, 23:29:34
    Author     : Everson
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="cabecalho.jsp" %>
<%@include file="menu.jsp" %>


    <div class="row">
        <div class="col-lg-8">
          
            <img src="<c:url value="resources/Imagens/fundo.jpg"/>" width="700" height="500"/>
                       
        </div>
    </div>
    <div class="row" >
        <%@include file="topCifra.jsp" %>
        <%@include file="topArtista.jsp" %>      
    </div>
    <div class="row">

    </div>



<%@include file="rodape.jsp" %>