<%-- 
    Document   : adsList
    Created on : 2022-04-11, 20:36:44
    Author     : melis
--%>

<%@page import="com.stagemont.entities.Ads"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/table.css" /> 
        <%@include file="../company/header.html" %>

        <%
            ArrayList<Ads> listAds = (ArrayList) request.getAttribute("listAds");

        %>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        
        <title>Publicités</title>
    </head>
    <body>
        <h1 class="center">Liste Des Publicités</h1>

        <table class="center">
            <tr>
                <th>Titre</th>
                <th>Description</th>
                <th>Image</th>
            </tr>

            <% if (listAds != null) {
                    for (Ads a : listAds) {%>
            <tr>
                <td><%=a.getTitle()%></td>
                <td> <%=a.getDescription()%> </td>
                <td>
                    <img alt="<%=a.getImage()%>"  src="${pageContext.request.contextPath}/images/<%=a.getImage()%>.png" height="100" width="100"/> 
                
                </td>
            </tr>

            <%}
            } else {%>

            <tr>listAds est <%=listAds%></tr>
            <%}%>

        </table>
    </body>
</html>
