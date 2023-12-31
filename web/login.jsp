<%-- 
    Document   : login
    Created on : Apr 3, 2022, 9:54:57 AM
    Author     : Brune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" /> 
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <title>Login page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="container">
            <div></div>
            <p class="text-center">username etudiant = stu={prenom}{id}</p>
            <p class="text-center">username professeur = tea={prenom}{id}</p>
            <p class="text-center">username entreprise = com={prenom}{id}</p>
            <p class="text-center">ex : com=google1</p>
            <h2>Connexion</h2>
            <c:if test="${not empty msgError}">
                <div class="alert alert-danger" role="alert">
                    <c:out value="${msgError}" />
                </div>
            </c:if>
            <c:if test="${not empty msgSuccess}">
                <div class="alert alert-success" role="alert">
                    <c:out value="${msgSuccess}" />
                </div>
            </c:if>
            <br/>
            <form action="login" method="post">

                <div class="form-group row">
                    <label for="uid" class="col-4 col-form-label">Identifiant</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-user-circle-o"></i>
                                </div>
                            </div> 
                            <input id="uid" name="uid" type="text" class="form-control" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="pw" class="col-4 col-form-label">Mot de passe</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-key"></i>
                                </div>
                            </div> 
                            <input id="pw" name="pw" type="password" required="required" class="form-control">
                        </div>
                    </div>
                </div> 
                <div class="form-group row">
                    <div class="offset-4 col-8">
                        <button name="submit" type="submit" class="btn btn-primary">Se connecter</button>
                    </div>
                </div>
            </form> 
            <div></div>
        </div>
    </body>
</html>





