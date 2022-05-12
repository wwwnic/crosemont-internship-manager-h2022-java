<%-- 
    Document   : studentForm
    Created on : 2022-05-08, 18:52:06
    Author     : Jefferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dashboard.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/table.css" /> 
        <%@include file="../student/header.html" %>
        <title>Modifier Étudiant</title>
        <style>
            #formulaire {
                height: 200px;
                width: 400px;


                position: fixed;
                top: 50%;
                left: 50%;
                margin-top: -100px;
                margin-left: -200px;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <div style="text-align: center">
                <h2>Modification d'un étudiant</h2>
                <div id="formulaire" class="container justify-content-center line">
                    <form>
                        <div class="form-row">
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Nom complet">
                            </div>
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Numéro DA">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <button type="submit" class="btn btn-primary">Modifier</button>
                            </div>
                            <div class="col">
                                <button type="submit" class="btn btn-danger">Annuler</button>
                            </div>
                        </div>


                    </form>
                </div>

            </div>

        </div>
        <form>

    </body>
</html>
