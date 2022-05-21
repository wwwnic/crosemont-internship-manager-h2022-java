<%-- 
    Document   : modifyStudent
    Created on : May 15, 2022, 11:39:45 AM
    Author     : Nicolas Brunet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./static/css/center.css" /> 
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>  
        <title>Formulaire editer entreprise</title>
    </head>
    <body>
        <div class="wrapper">
            <div></div>
            <div>
                <br/>
                <h2 class="text-center">Editer entreprise</h2>
                <c:if test="${not empty msgError}">
                    <div class="alert alert-danger" role="alert">
                        <c:out value="${msgError}" />
                    </div>
                </c:if>
                <br/>
                <form id="editCompany" action="editCompany" method="post">
                    <input type="hidden" id="id" name="id" value=<c:out value="${id}" />>
                    <div class="form-group row">
                        <label for="cname" class="col-4 col-form-label">Nom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-badge"></i>
                                    </div>
                                </div> 
                                <input id="cname" name="cname" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="cphone" class="col-4 col-form-label">Téléphone</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-phone"></i>
                                    </div>
                                </div> 
                                <input id="cphone" name="cphone" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="email" class="col-4 col-form-label">Courriel</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-envelope"></i>
                                    </div>
                                </div> 
                                <input id="email" name="email" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="personInCharge" class="col-4 col-form-label">Personne en charge</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-user"></i>
                                    </div>
                                </div> 
                                <input id="personInCharge" name="personInCharge" type="text" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="password" class="col-4 col-form-label">Mot de passe</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-key"></i>
                                    </div>
                                </div> 
                                <input id="password" name="password" type="password" class="form-control">
                            </div>
                        </div>
                    </div> 
                    <div class="form-group row">
                        <div class="offset-4 col-8">
                            <button name="submit" type="submit" class="btn btn-primary">Soumettre</button>
                        </div>
                    </div>
                </form>
            </div>
            <div></div>
        </div>
    </body>
</html>
