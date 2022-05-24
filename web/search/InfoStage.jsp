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
            <div></div>
            <div>
                <div class='line'>
                    </br>     
                    <p id="elementname">Numéro de stage</p>
                    <p id="element"><c:out value = "${intern.id}"/></p>
                    <p id="elementname">Nom de l'entreprise</p>
                    <p id="element"><c:out value = "${company.name}"/></p>
                    <p id="elementname">Description</p>
                    <p id="element"><c:out value = "${intern.description}"/></p>
                    <p id="elementname">Date de début</p>
                    <p id="element"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${intern.start_date}" /></p>
                    <p id="elementname">Date de fin</p>
                    <p id="element"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${intern.end_date}" /></p>
                    <p id="elementname">Postuler par courriel</p>
                    <svg width="84" height="64" viewBox="0 0 84 64" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path d="M66 24C66.68 24 67.36 24.04 68 24.12V7.48C68 3.36 64.64 0 60.52 0H7.48C3.36 0 0 3.36 0 7.48V48.52C0 52.64 3.36 56 7.48 56H46.4C44.88 53 44 49.6 44 46C44 33.84 53.84 24 66 24ZM33.6 32L8 16.76V8H8.92L33.64 22.72L58.96 8H60V16.64L33.6 32Z" fill="#0A98E8"/>
                    <path d="M68 32L62.36 37.64L68.68 44H52V52H68.68L62.36 58.36L68 64L84 48L68 32Z" fill="#0A98E8"/>
                    </svg>
                    </br>     
                    </br>     
                </div>
                    <div>
                        <br>
                        <button class="btnBlue btnhorcenter">Postuler</button>
                    </div>
                <div></div>
            </div>  
        </div>
    </body>
</html>
