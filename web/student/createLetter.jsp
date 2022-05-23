<%-- 
    Document   : createLetter
    Created on : May 21, 2022, 9:20:45 PM
    Author     : Brune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
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

        <title>Create PDF Letter</title>
    </head>
    <body>
        <div class="wrapper">
            <div></div>
            <div>
                <br>
                <h2>Creation de la lettre de motivation</h2> 
                <div class="line">
                    <form action="createPdf" method="post">
                        <input type="hidden" id="titleText" name="title" value="Lettre de <c:out value="${fname}" /> <c:out value="${lname}" />:" />
                        <input type="hidden" id="documentName" name="documentName" value="letter" />
                        <input type="hidden" id="id" name="id" value=<c:out value="${id}" />>
                        <div class="form-group">
                            <textarea id="motivLetterText" name="text" cols="40" rows="15" aria-describedby="letterHelpBlock" required="required" class="form-control"></textarea> 
                            <span id="letterHelpBlock" class="form-text text-muted">Faites-nous part de vos intentions.</span>
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
