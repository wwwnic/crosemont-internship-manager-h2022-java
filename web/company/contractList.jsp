<%-- 
    Document   : contractList
    Created on : 2022-04-04, 19:49:19
    Author     : melis
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.stagemont.entities.Company"%>
<%@page import="com.stagemont.entities.Contract"%>
<%@page import="com.stagemont.entities.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" />
        <link rel="stylesheet" type="text/css" href="./static/css/table.css" />
        <link rel="stylesheet" type="text/css" href="./static/css/contract.css" /> 

        <link rel="stylesheet" href="/resources/demos/style.css">
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
        <h1 class="center">Liste Des Candidatures</h1>

        <!--
        <h1>id : <c:out value = "$//{idConnecte}"/> </h1>
        -->

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
                <td>
                    <a href="showPDF?id=<%=s.getId()%>&fname=<%=s.getFirstname()%>&lname=<%=s.getLastname()%>&fileType=CV" target="_blank" data-toggle="tooltip" title="voir votre cv">
                        <img src="./static/images/PDF.png" width="50px" alt="PDF2">
                    </a>

                </td>
                <td>
                    <a href="showPDF?id=<%=s.getId()%>&fileType=letter" target="_blank" data-toggle="tooltip" title="voir votre lettre">
                        <img src="./static/images/PDF.png" width="50px" alt="PDF2">
                    </a>
                </td>
                <td>
                    <%
                        if (c.getStatus().toString().equals("SUBMIT")) {
                    %>
                    SOUMIS
                    <%
                    } else if (c.getStatus().toString().equals("INTERVIEW")) {
                    %>
                    ENTREVUE
                    <%
                    } else if (c.getStatus().toString().equals("EMPLOY")) {
                    %>
                    EMBAUCHÉ
                    <%
                        }
                    %>
                </td>
                <td><%=c.getStart_date()%></td>
                <td><%=c.getEnd_date()%></td>
                <td>
                    <button type="button" class="btnBlue"> <a href="contract?companyId=<%=c.getCompany_id()%>&studentId=<%=s.getId()%>&contractId=<%=c.getId()%>">Voir détails</a></button>
                </td>
            </tr>

            <%}
                    }
                }
            } else {%>

            <tr>listContracts est <%=listContracts%></tr>
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
