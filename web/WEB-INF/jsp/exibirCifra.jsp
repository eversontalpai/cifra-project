<%-- 
    Document   : exibirCifra
    Created on : 15/11/2016, 20:26:58
    Author     : Everson
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="cabecalho.jsp" %>
<%@include file="menu.jsp" %>


<div class="row">
    <div class="span4">
        <img src="${cifra.artista.imagem}" class="img-rounded">
    </div>
   
</div>
<div class="row">
    <div class="span4">
        <ul class="nav nav-pills nav-stacked">            
           <li><a href="#"><i class="icon-pencil"></i> Editar Cifra</a></li>
        </ul>
    </div>
    
    <div class="span6 offset1">
        <c:if test="${not empty cifra}">
        <div class="row page-header">
            <div class="span6">
                <h3 class="into-text text-center">
                    ${cifra.titulo}
                </h3>
                <h3 class="into-text text-center">
                    <a href="cifras?id=${cifra.artista.id}">${cifra.artista.nomeArtista}</a>
                </h3>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="media span4">

        <div class="media-body">
            <h4 class="media-heading">Descrições do Artista</h4>

            <div class="media">
                ${cifra.artista.informacoes}
            </div>
        </div>
    </div>






    <div class="media span6 offset1" >
       <div class="media-body">
            <div class="media">
                <p> ${cifra.conteudo}</p>
            </div>
        </div>
    </div>


</div>
</c:if>




<%@include file="rodape.jsp" %>