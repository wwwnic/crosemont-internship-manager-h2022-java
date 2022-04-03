<%-- 
    Document   : dashbord
    Created on : 2022-03-20, 13:15:59
    Author     : Nicolas Brunet
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dashboard.css" /> 
        <%@include file="../company/header.html" %>
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
                        <p id="element"><td><c:out value = "${name}"/></td>
                        </p>
                        </br>
                        <p id="elementname">Téléphone</p>
                        <p id="element"><c:out value = "${phone}"/></p>
                        </br>
                        <p id="elementname">Courriel</p>
                        <a id="element" class="url" href='mailto:<c:out value = "${email}"/>'><c:out value = "${email}"/></a>
                        </br>
                        </br>
                        <p id="elementname">Personne à contacter</p>
                        <p id="element"><c:out value = "${personInCharge}"/></p>
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
            </div>    
            <div></div>    
    </body>
</html>
