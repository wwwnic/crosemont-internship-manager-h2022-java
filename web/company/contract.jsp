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
        <link rel="stylesheet" type="text/css" href="./static/css/contract.css" /> 
        <%@include file="../company/header.html" %>


        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <script src="./static/js/formToggler.js"></script>

        <title>Contract</title>
    </head>
    <body>
        <br/>
        <div class="wrapper">
            <div></div>  
            <div>
                <div>
                    <p id="pagetitle">Élaboration d'un contrat</p>
                    <div class='line'>
                        <p id="elementname"> Numéro du stage :</p>
                        <p id="element"><c:out value = "${company.getId()}"/></p>
                        <br/>
                        <p id="elementname"> La compagnie :</p>
                        <p id="element"><c:out value = "${company.getName()}"/></p>
                        <br/>
                        <p id="elementname"> Le candidat :</p>
                        <p id="element"><c:out value = "${student.getFirstname()}"/> <c:out value = "${student.getLastname()}"/></p>
                        <p id="element">DA : <c:out value = "${student.getDa()}"/> </p>
                        <br/>
                        <p id="elementname">Durant la période suivante :</p>
                        <p id="element"><c:out value = "${contract.getStart_date()}"/> jusqu'à: <c:out value = "${contract.getEnd_date()}"/></p>
                        <br/>

                        <p id="elementname"> Le status du candidat :</p>

                        <c:set var="status" value="${contract.getStatus()}"/>

                        <c:if test = "${status == 'SUBMIT'}">
                            <p id="element">Soumis</p>
                            <br/>
                            <form id="contractForm" method="post" action="contractForm?idC=${contract.getId()}">
                                <div>
                                    <label id="elementname" for="mdp">Signer virtuellement pour l'envoyer en entrevue:</label>
                                    <input class="form-control" type="password" id="mdp" name="mdpSUBMIT">   
                                </div> 

                                </br>

                                <div class="column btncontainer">
                                    <button type="submit" form="contractForm" class="btnBlue">Soumettre</button>
                                </div>

                                </br>

                            </form>
                        </c:if>

                        <c:if test = "${status == 'INTERVIEW'}">
                            <p id="element">Entrevue</p>
                            <br/>

                            <form id="contractForm" method="post" action="contractForm?idC=${contract.getId()}">
                                <div>
                                    <label id="elementname" for="mdp">Signer virtuellement pour l'embaucher :</label>
                                    <input class="form-control" type="password" id="mdp" name="mdpINTERVIEW">   
                                </div>

                                </br>

                                <div class="column btncontainer">
                                    <button type="submit" form="contractForm" class="btnBlue">Soumettre</button>
                                </div>

                                </br>

                            </form>
                        </c:if>

                        <c:if test = "${status == 'EMPLOY'}">

                            <p id="element">Embauché</p>
                            <br/>

                            <p id="element">Ce candidat est déjà embauché!</p>
                        </c:if>
                        <br/>

                    </div>


                    <br/>
                    <div class="row">

                        <div class="column btncontainer">
                            <a href="contractDelete?idC=${contract.getId()}">
                                <button class="btnRed btncenter">Supprimer</button>
                            </a>
                        </div>

                        <div class="column btncontainer">
                            <a href="contractEdit?idC=${contract.getId()}">
                                <button class="btnBlue btncenter">Modifier</button>
                            </a>
                        </div>



                    </div>
                </div>    
            </div>
    </body>
</html>
