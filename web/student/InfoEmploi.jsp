<%-- 
    Document   : infoEmploi
    Created on : 2022-05-08, 19:51:02
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
        <title>Détails Emplois</title>
    </head>
    <body>
        <div class="wrapper">
            <div>

            </div>

            <div>
                <h1 class="text-center">Détails de l'emploi</h1>
                <div>
                    </br>
                    <div class='line'>
                        </br>
                        </br>     
                        <p id="elementname">Nom de l'entreprise</p>
                        <p id="element"><c:out value = "${company.name}"/></p>
                        </br>
                        <p id="elementname">Description</p>
                        <p id="element"><c:out value = "${job.description}"/></p>
                        </br>
                        <p id="elementname">Numéro de l'emploi</p>
                        <p id="element"><c:out value = "${job.id}"/></p>
                        </br>
                        <p id="elementname">Date de début</p>
                        <p id="element"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${job.start_date}" /></p>
                        </br>
                        <p id="elementname">Date de fin</p>
                        <p id="element"><fmt:formatDate pattern = "yyyy-MM-dd" value = "${job.end_date}" /></p>
                        </br>

                    </div>
                    </br>
                    <c:set var = "salary" scope = "session" value = "${2000*2}"/>
                    <c:if test = "${salary > 60000}">
                        <div class="row">
                            <div class="column btncontainer">
                                <button class="btnBlue btncenter fa-2xl">Modifier</button>
                            </div>
                            <div class="column btncontainer">
                                <button class="btnRed btncenter">Supprimer</button>
                            </div>
                        </div>
                    </c:if>


                </div>
            </div>
            <div></div>
        </div>
    </div>
</body>
</html>
