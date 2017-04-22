<%-- 
    Document   : cifrasArtista
    Created on : 12/11/2016, 00:17:34
    Author     : Everson
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="cabecalho.jsp" %>
<%@include file="menu.jsp" %>


<div class="row">
    <div class="span4">
        <img src="${artista.imagem}" class="img-rounded">
    </div>
</div>
<div class="row">
    <div class="span4">
        <ul class="nav nav-pills nav-stacked">
            <li class="active"><a href="enviarCifra"><i class="icon-music"></i> Enviar Cifra</a></li>
           
        </ul>
    </div>
    
    <div class="span6 offset1">

        <div class="row page-header">
            <div class="span2">
                <h2 class="into-text text-center">
                    ${artista.nomeArtista}
                </h2>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="media span4">

        <div class="media-body">
            <h4 class="media-heading">Descrições do Artista</h4>

            <div class="media">
                ${artista.informacoes}
            </div>
        </div>
    </div>






    <div class="span6 offset1" >
        <c:if test="${not empty resposta}">

            <table class="table table-striped">
                <thead>
                <th></th>

                </thead>
                <tbody>
                    <c:forEach  items="${resposta}" var="cifra" >
                        <tr>


                    <td><a href="cifra?id=${cifra.id}">${cifra.titulo}</a></td>


                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>
        <c:if test="${empty resposta}">
            <CENTER>
                <h3><font color ='#FF0000' >Não há Cifras cadastradas para este artista</font><br></h3>



            </CENTER>
        </c:if>
    </div>


</div>





<%@include file="rodape.jsp" %>