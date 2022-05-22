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

        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <div class="form-group">
                <label for="lettre">Votre lettre</label> 
                <textarea id="lettre" name="lettre" cols="40" rows="20" aria-describedby="lettreHelpBlock" required="required" class="form-control"></textarea> 
                <span id="lettreHelpBlock" class="form-text text-muted">Écrivez votre lettre dans le champ</span>
            </div> 
            <div class="form-group">
                <button name="submit" type="submit" class="btn btn-primary">Sauvegarder</button>
            </div>
        </form> 
    </body>
</html>
