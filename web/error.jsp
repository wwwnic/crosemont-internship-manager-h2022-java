<%-- 
    Document   : error
    Created on : May 22, 2022, 11:24:30 AM
    Author     : Nicolas Brunet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

        <c:if test="${sessionScope.type=='student'}"><%@include file="../student/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='company'}"><%@include file="../company/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if> 
    </head>
    <body>
        </br>
        <h1 class='text-center'>Erreur 404 !</h1>
        <h2 class='text-center'>Page introuvable</h2>
    </body>
</html>
