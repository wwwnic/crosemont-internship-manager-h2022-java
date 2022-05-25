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
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" />
        <link rel="stylesheet" type="text/css" href="./static/css/dashboard.css" /> 
        <link rel="stylesheet" type="text/css" href="./static/css/contract.css" />
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
                        <p id="element"><c:out value = "${name}"/>
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
                            <a href="editDashboard?id=<c:out value = "${id}"/>">
                                <button class="btnBlue btncenter">Modifier</button>
                            </a>
                        </div>
                        <!--
                        <div class="column btncontainer">
                            <a>
                                <button class="btnRed btncenter">Supprimer</button>
                            </a>
                        </div>
                        -->
                    </div>
                    </br>
                    <div class="row">
                        <p id="pagetitle">En tant qu'entreprise, vous pouvez ajouter des emplois et des stages. </p>


                        <div class="column btncontainer">
                            <a href="addJob">
                                <button class="btnBlue btncenter">Emploi</button>
                            </a>
                        </div>


                        <div class="column btncontainer">
                            <a href="addInternship">
                                <button class="btnBlue btncenter">Stage</button>
                            </a>
                        </div>

                    </div>
                </div>
            </div>    
            <div></div>    
    </body>
</html>
