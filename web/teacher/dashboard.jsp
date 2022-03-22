<%-- 
    Document   : dashbord
    Created on : 2022-03-20, 13:15:59
    Author     : Nicolas Brunet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dashboard.css" /> 
        <%@include file="../teacher/header.html" %>
        <title>Dashboard</title>
    </head>
    <body>
        </br>
        <div class="wrapper">
            <div></div>  
            <div>
                <div>
                    <p id="pagetitle">Informations de l’entreprise</p>
                    <div class='line'>
                        </br>
                        <p id="elementname">Nom</h2>
                        <p id="element"><%=request.getAttribute("name")%></p>
                        </br>
                        <p id="elementname">Téléphone</p>
                        <p id="element"><%=request.getAttribute("phone")%></p>
                        </br>
                        <p id="elementname">Courriel</p>
                        <a id="element" href='mailto:<%=request.getAttribute("email")%>'><%=request.getAttribute("email")%></a>                        </br>
                        </br>
                        <p id="elementname">Personne à contacter</p>
                        <p id="element"><%=request.getAttribute("personInCharge")%></p>
                        </br>
                    </div>
                    </br>
                    <div class="row">
                        <div class="column btncontainer">
                            <button class="btnBlue btncenter">Modifier</button>
                        </div>
                        <div class="column btncontainer">
                            <button class="btnRed btncenter">Supprimer</button>
                        </div>
                    </div>
                </div>
                <div></div>    
            </div>    
    </body>
</html>
