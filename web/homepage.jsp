<%-- 
    Document   : homepage
    Created on : 2022-04-02, 16:16:55
    Author     : Jefferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page d'Accueil</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

        <c:if test="${sessionScope.type=='student'}"><%@include file="../student/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='company'}"><%@include file="../company/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if> 
        <script>
            $(function () {
                $("#accordion").accordion();
            });
        </script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-12 col-sm-offset-2">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner">
                            <div class="item active">
                                <img src="./static/images/INTERNSHIP.jpg" alt="Image d'accueil">
                            </div>

                            <div class="item">
                                <img src="./static/images/DOCTOR.jpg" alt="Doctor">
                            </div>

                            <div class="item">
                                <img src="./static/images/CODING.jpg" alt="Coder">
                            </div>
                        </div>
                        <!-- Left and right controls -->
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12 col-sm-offset-2">
                    <h1>Notifications</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12 col-sm-offset-1">
                    <h2>Comment fonctionne le site ?</h2>
                    <div id="accordion">
                        <h3>Postuler</h3>
                        <div>
                            <p>
                                Vous allez pouvoir postuler pour un stage de votre choix.
                            </p>
                        </div>
                        <h3>Entrevue</h3>
                        <div>
                            <p>
                                Si une entreprise est intéressée par votre candidature, elle vous contacteras pour une entrevue.
                            </p>
                        </div>
                        <h3>Embauche</h3>
                        <div>
                            <p>
                                Si vous êtes retenue par l'entreprise, vous serez invité à signer un contrat d'embauche.
                            </p>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </body>
</html>
