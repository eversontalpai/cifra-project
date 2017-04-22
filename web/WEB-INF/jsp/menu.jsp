<%-- 
    Document   : menu
    Created on : 17/06/2016, 23:38:18
    Author     : Everson
--%>
<%--

<div class="navbar navbar-inverse"> 
    <div class="container-fluid">

        
<%-- <div class="navbar-header">
         <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="sr-only"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
         </a>
        <a class="brand" href="r?page=index">CifraProject</a>
<%--</div>
<div class="collapse navbar-collapse" >
<div class="col-lg-10">     
    <ul class="nav navbar-nav">                    
        <li><a href="artistas?letra=A">Artistas</a></li>
        <li><a href="#">Estilos</a></li>
        <li><a href="r?page=cifrasArtista">Cifras</a></li>
        <li><a href="r?page=cadastro">Cadastro</a></li>
            <c:if test="${not empty login}">
            <li><a href="r?page=enviarCifra">Enviar Cifras</a></li>
            </c:if>
    </ul>
</div>

                <c:if test="${empty login}">
                    <div class="col-lg-1">
                        <ul class="nav navbar-nav"> 
                            <li><a href="r?page=login">Entrar</a></li>
                        </ul>
                    </div>
                </c:if>
                <c:if test="${not empty login}">
                    <div class="col-lg-1">
                        <ul class="nav navbar-nav"> 
                            <li><a href="Controlador?class=LogicaControladoraLogout">Sair</a></li>
                        </ul>
                    </div>
                </c:if>
            </div>

        </div>

</div>--%>
<div class="navbar">
    <div class="navbar-inverse">
        <div class="container">


            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>


            <a class="brand" href="index">CifraProject</a>

            <!-- Tudo que você queira escondido em 940px ou menos, coloque aqui -->
            <div class="nav-collapse collapse">
                <div class="span10">    
                    <ul class="nav navbar-nav">                    
                        <li><a href="artistas?letra=A">Artistas</a></li>
                        <li><a href="#">Estilos</a></li>
                        <li><a href="r?page=cadastro">Cadastro</a></li>
                        
                    </ul>
                
                <c:if test="${empty login}">
                    <div class="offset5 span1">
                        <ul class="nav navbar-nav"> 
                            <li><a href="r?page=login">Entrar</a></li>
                        </ul>
                    </div>
                </c:if>
                <c:if test="${not empty login}">
                    <div class="offset4 span1">
                        <ul class="nav navbar-nav"> 
                            <li><a href="Controlador?class=LogicaControladoraLogout">Sair</a></li>
                        </ul>
                    </div>
                </c:if>
            </div>

        </div>
    </div>
</div>
<div class="container quadro">
