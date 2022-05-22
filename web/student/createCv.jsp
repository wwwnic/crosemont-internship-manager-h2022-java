<%-- 
    Document   : createPDFcv
    Created on : May 21, 2022, 9:19:06 PM
    Author     : Brune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

        <c:if test="${sessionScope.type=='student'}"><%@include file="../student/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='company'}"><%@include file="../company/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if> 
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" />
        <link rel="stylesheet" type="text/css" href="./static/css/line.css" />

        <title>Create PDF CV</title>
    </head>
    <body>
        <div class="wrapper">
            <div></div>
            <div>
                <br>
                <h2>Creation d'un CV</h2> 
                <div class="line">
                    <form action="createPdf" method="post">
                        <input type="hidden" id="titleText" name="title" value="Présentation de <c:out value="${fname}" /> <c:out value="${lname}" />:" />
                        <input type="hidden" id="documentName" name="documentName" value="CV" />
                        <input type="hidden" id="id" name="id" value=<c:out value="${id}" />>
                        <input type="hidden" id="fname" name="fname" value=<c:out value="${fname}" />>
                        <input type="hidden" id="lname" name="lname" value=<c:out value="${lname}" />>
                        <div class="form-group">
                            <textarea id="cvText" name="text" cols="40" rows="15" aria-describedby="CVHelpBlock" required="required" class="form-control"></textarea> 
                            <span id="CVHelpBlock" class="form-text text-muted">Présentez-vous aux employeurs de Stagemont, entrez votre expérience d'emplois ainsi que vos compétences personnel.</span>
                        </div> 
                        <div class="form-group">
                            <button name="submit" type="submit" class="btn btn-primary">Sauvegarder</button>
                        </div>
                    </form>
                </div>
            </div>
            <div></div>
        </div>
    </body>
</html>
