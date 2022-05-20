<%-- 
    Document   : InfoStage
    Created on : 2022-05-08, 19:51:17
    Author     : Jefferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="./static/css/dashboard.css" />
        <link rel="stylesheet" type="text/css" href="./static/css/table.css" /> 
        <%@include file="../student/header.html" %>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <title>Détails Stages</title>
    </head>
    <body>
        <h1 class="text-center">Détails du stage</h1>
        <div class="wrapper">
            <div>
                
            </div>
            <div>
                </br>
                <div class='line'>
                    </br>
                    </br>     
                    <p id="elementname">Nom de l'entreprise</p>
                    <p id="element"><c:out value = "${company.name}"/></p>
                    </br>
                    <p id="elementname">Description</p>
                    <p id="element"><c:out value = "${intern.description}"/></p>
                    </br>
                    <p id="elementname">Status du stage</p>
                    
                    </br>
                    <p id="elementname">Numéro de stage</p>
                    <p id="element"><c:out value = "${intern.id}"/></p>
                    </br>
                    <p id="elementname">Date de début</p>
                    <p id="element"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${intern.start_date}" /></p>
                    </br>
                    <p id="elementname">Date de fin</p>
                    <p id="element"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${intern.end_date}" /></p>
                    </br>
                    <i class="fa-solid fa-envelope"></i><p>Postuler par courriel</p>
                </div>
                </br>
                <div class="row">
                    <div class="column btncontainer">
                        <button class="btnBlue btncenter fa-2xl">Postuler</button>
                    </div>
                    
                </div>
            </div>
            <div></div>
        </div>  
    </body>
</html>
