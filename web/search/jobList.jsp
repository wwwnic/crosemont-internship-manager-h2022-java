<%-- 
    Document   : internList
    Created on : 2022-04-21, 23:07:08
    Author     : melis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/thumbnail.css" /> 
        <c:if test="${sessionScope.type=='student'}"><%@include file="../student/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='company'}"><%@include file="../company/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if> 
        <title>Liste des emplois</title>
    </head>
    <body>
        </br>
        <h1 class="text-center">Liste Des Emplois</h1>
        </br>
        <div class="container">
            <div class="cardDiv">
                <input class="form-control " type="text" placeholder="Recherche">
                </br>
                <c:forEach items="${listJob}" var="job">
                    <div class="thumbnail thumbnailMarging">
                        <div class="thumbnail-header"><c:out value = "${job.title}"/></div>
                        <div class="thumbnail-body">
                            <c:out value = "${job.description}"/>
                            <br>
                            <a href="showJobDashboard?id=<c:out value = "${job.id}"/>"><button class="thumbnail-button">Visionner</button></a>
                        </div> 
                    </div>
                </c:forEach>
            </div>
            </br>
        </div>
    </body>
</html>