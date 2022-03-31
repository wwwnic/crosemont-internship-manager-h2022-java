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
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/contract.css" /> 
        <%@include file="../company/header.html" %>


        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <script src="../js/calenderFrench.js"></script>

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
                        <p id="elementname"> La compagnie :</p>
                        <p id="element"><c:out value = "${name}"/></p>
                        <p id="elementname"> Désire embaucher :</p>
                        <p id="element"><c:out value = "${firstName}"/> <c:out value = "${lastName}"/></p>
                        <p id="elementCalender">Durant la période suivante :</p>
                        <form id="contractForm" method="post" action="#">
                            <div>
                                <div class="row">
                                    <div class="column inputcontainer">
                                        <label id="label" for="from">De:</label>
                                        <input class="form-control" type="text" id="from" name="from">   
                                    </div>
                                    <div class="column inputcontainer">
                                        <label id="label" for="to">À:</label>
                                        <input class="form-control" type="text" id="to" name="to">   
                                    </div>
                                </div>
                                <label id="label" for="mdp">Signer virtuellement avec votre mot de passe :</label>
                                <input class="form-control" type="password" id="mdp" name="mdp">   
                            </div>
                        </form>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="column btncontainer">
                            <button class="btnRed btncenter">Annuler</button>
                        </div>
                        <div class="column btncontainer">
                            <button type="submit" form="contractForm" class="btnBlue btncenter">Soumettre</button>
                        </div>
                    </div>
                </div>    
            </div>
            <div></div>    
    </body>
</html>
