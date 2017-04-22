<%-- 
    Document   : artistas
    Created on : 11/11/2016, 14:33:20
    Author     : Everson
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="cabecalho.jsp" %>
<%@include file="menu.jsp" %>


<div class="row">
    <div class="span12">
        <hr>
    </div>
    <div class="row page-header">
        <div class="span2 offset5">
            <h2 class="into-text text-center">
                Artistas
            </h2>
        </div>
    </div>
    <div class="btn-toolbar row span10">
        <div class="btn-group">

            <a class="btn" href="artistas?letra=A">A</a>
            <a class="btn" href="artistas?letra=B">B</a>
            <a class="btn" href="artistas?letra=C">C</a>
            <a class="btn" href="artistas?letra=D">D</a>
            <a class="btn" href="artistas?letra=E">E</a>
            <a class="btn" href="artistas?letra=F">F</a>
            <a class="btn" href="artistas?letra=G">G</a>
            <a class="btn" href="artistas?letra=H">H</a>
            <a class="btn" href="artistas?letra=I">I</a>
            <a class="btn" href="artistas?letra=J">J</a>
            <a class="btn" href="artistas?letra=K">K</a>
            <a class="btn" href="artistas?letra=L">L</a>
            <a class="btn" href="artistas?letra=M">M</a>
            <a class="btn" href="artistas?letra=N">N</a>
            <a class="btn" href="artistas?letra=O">O</a>
            <a class="btn" href="artistas?letra=P">P</a>
            <a class="btn" href="artistas?letra=Q">Q</a>
            <a class="btn" href="artistas?letra=R">R</a>
            <a class="btn" href="artistas?letra=S">S</a>
            <a class="btn" href="artistas?letra=T">T</a>
            <a class="btn" href="artistas?letra=U">U</a>
            <a class="btn" href="artistas?letra=V">V</a>
            <a class="btn" href="artistas?letra=X">X</a>
            <a class="btn" href="artistas?letra=W">W</a>
            <a class="btn" href="artistas?letra=Y">Y</a>
            <a class="btn" href="artistas?letra=Z">Z</a>

        </div>
    </div>

</div>

<div class="row">
    <div class="span12">
        <hr>
    </div>
    <div class="row page-header">
        <div class="span1 offset6">
            <h2 class="into-text text-center">
                ${letra}
            </h2>

        </div>
    </div>
</div>
<div class="row">
    <div class="span4 offset4" >
        <c:if test="${not empty resposta}">

            <ul class="media-list">
                <c:forEach  items="${resposta}" var="banda" >

                    <li class="media">
                       

                        <a class="pull-left" href="cifras?id=${banda.id}">
                            <img class="media-object" src="${banda.imagem}" width="50" height="50">
                        </a>
                        <div class="media-body">

                            <h4 class="media-heading">${banda.nomeArtista}</h4>
                        </div>
                        <div class="media">

                            

                        </div>

                    </li>




                </c:forEach>
            </ul>        
        </c:if>
        <c:if test="${empty resposta}">
            <CENTER>
                <h3><font color ='#FF0000' >Não há Artistas cadastrados iniciando com esta letra</font><br></h3>



            </CENTER>
        </c:if>
    </div>

</div>



<%@include file="rodape.jsp" %>