<%-- 
    Document   : jobList
    Created on : 2022-04-21, 22:45:26
    Author     : melis
--%>

<%@page import="com.stagemont.entities.Job"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/table.css" /> 
        <%@include file="../company/header.html" %>

        <title>Liste des emplois</title>

        <%
            ArrayList<Job> listJob = (ArrayList) request.getAttribute("listJob");

        %>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>


        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

    </head>
    <body>
        <h1 class="center">Liste Des Emplois</h1>

        <div class="container">
            
            <input class="container" type="text" placeholder="Rechercher">
            </br>
            </br>
            </br>


            <% if (listJob != null) {
                    for (Job job : listJob) {%>

            <div class="card bg-info text-white">
                <div class="card-header"><%=job.getTitle()%></div>
                <div class="card-body"><%=job.getDescription()%></div> 
                <div class="card-footer"><button type="button">Voir détails</button></div>
            </div>
            </br>

            <%}
            } else {%>

            <tr>listAds est <%=listJob%></tr>
            <%}%>
        </div>


    </body>
</html>
