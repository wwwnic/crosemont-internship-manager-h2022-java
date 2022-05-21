<%-- 
    Document   : internList
    Created on : 2022-04-21, 23:07:08
    Author     : melis
--%>

<%@page import="com.stagemont.entities.Internship"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" />
        <link rel="stylesheet" type="text/css" href="./static/css/table.css" /> 
        <c:if test="${sessionScope.type=='student'}"><%@include file="../student/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='company'}"><%@include file="../company/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if> 
        <title>Liste des stages</title>

        <%--
            ArrayList<Internship> listIntern = (ArrayList) request.getAttribute("listIntern");

        --%>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>


        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <h1 class="center">Liste Des Stages</h1>

        <div class="container">

            <input class="container" type="text" placeholder="Rechercher">
            </br>
            </br>
            </br>

            <%-- if (listIntern != null) {
                    for (Internship i : listIntern) {--%>
            <c:forEach items="${listInternship}" var="intern">
                <div class="card bg-info text-white">
                    <div class="card-header"><c:out value = "${intern.getTitle()}"/></div>
                    <div class="card-body"><c:out value = "${intern.getDescription()}"/></div> 
                    <div class="card-footer"><button type="button"><a href="showStudentInfoStage?id=<c:out value = "${intern.getId()}"/>">Voir détails</a></button></div>
                </div>
            </c:forEach>
            </br>

            <%--}
            } else {%>

            <tr>listAds est <%=listIntern%></tr>
            <%}--%>
        </div>
    </body>
</html>
