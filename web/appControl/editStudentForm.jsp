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
        <title>Formulaire editer etudiant</title>
    </head>
    <body>
        <div class="wrapper">
            <div></div>
            <div>
                <br/>
                <h2 class="text-center">Editer etudiant</h2>
                <c:if test="${not empty msgError}">
                    <div class="alert alert-danger" role="alert">
                        <c:out value="${msgError}" />
                    </div>
                </c:if>
                <br/>
                <form id="editStudent" action="editStudent" method="post">
                    <input type="hidden" id="uid" name="uid" value=<c:out value="${uid}" />>
                    <div class="form-group row">
                        <label for="fname" class="col-4 col-form-label">Prenom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-card"></i>
                                    </div>
                                </div> 
                                <input id="fname" name="fname" type="text" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="lname" class="col-4 col-form-label">Nom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-card"></i>
                                    </div>
                                </div> 
                                <input id="lname" name="lname" type="text" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="da" class="col-4 col-form-label">Numéro étudiant</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-card"></i>
                                    </div>
                                </div> 
                                <input id="da" name="da" type="text" required="required" class="form-control">
                            </div>
                        </div>
                    </div> 
                    <div class="form-group row">
                        <label class="col-4 col-form-label" for="password">Mot de passe</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-key"></i>
                                    </div>
                                </div> 
                                <input id="password" name="password" type="password" class="form-control" required="required">
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
