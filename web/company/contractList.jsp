<%-- 
    Document   : contractList
    Created on : 2022-04-04, 19:49:19
    Author     : melis
--%>

<%@page import="com.stagemont.entities.Contract"%>
<%@page import="com.stagemont.entities.Student"%>
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
            ArrayList<Contract> listContracts = (ArrayList) request.getAttribute("listContracts");

            ArrayList<Student> listStudents = (ArrayList) request.getAttribute("listStudents");
        %>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>

        <title>Candidatures</title>
    </head>
    <body>
        <h1 class="center">Liste Des candidatures</h1>

        <table class="center">
            <tr>
                <th>Nom</th>
                <th>Prenom</th>
                <th>DA</th>
                <th>CV</th>
                <th>Motivation</th>
                <th>Status</th>
                <th>Date début</th>
                <th>Date fin</th>
                <th>Panneau de contrôle</th>
            </tr>

            <% if (listContracts != null) {
                    for (Contract c : listContracts) {
                        for (Student s : listStudents) {

                            if (s.getId() == c.getStudent_id()) {%>
            <tr>
                <td><%=s.getFirstname()%></td>
                <td> <%=s.getLastname()%> </td>
                <td><%=s.getDa()%> </td>
                <td>(ici CV)</td>
                <td>(ici motivation)</td>
                <td><%=c.getStatus()%></td>
                <td><%=c.getStart_date()%></td>
                <td><%=c.getEnd_date()%></td>
                <td>
                    <button type="button">Voir détails</button>
                </td>
            </tr>

            <%}
                    }
                }
            } else {%>

            <tr>listeProduits est <%=listContracts%></tr>
            <%}%>

        </table>

        </br>
        </br>
        </br>
        
        <div class = "everythingTimeline">
            <div class ="bodyTimeline">
                <%@ include file = "../company/timeline.jsp" %>
            </div>
        </div>


    </body>
</html>
