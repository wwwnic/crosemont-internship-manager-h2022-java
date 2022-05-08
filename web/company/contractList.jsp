<%-- 
    Document   : contractList
    Created on : 2022-04-04, 19:49:19
    Author     : melis
--%>

<%@page import="com.stagemont.entities.Company"%>
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

            ArrayList<Company> listCompanyDAO = (ArrayList) request.getAttribute("listCompanyDAO");
            
            ArrayList<Contract> listContractsByCompanyId = (ArrayList) request.getAttribute("listContractsByCompanyId");

            Company comp = (Company) request.getAttribute("companyTest");
        %>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>

        <title>Candidatures</title>
    </head>
    <body>
        <h1 class="center">Liste Des Candidatures</h1>

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
                <!--
                <td><//%=c.getId()%></td>
                <td><//%=c.getCompany_id()%></td>
                <td><//%=c.getStudent_id()%></td>
                -->
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

            <tr>listContracts est <%=listContracts%></tr>
            <%}%>

        </table>
            
        </br>
        </br>
        </br>
        <h1>TEST FIND CONTRACTS BY COMPANY ID (example here: 3) </h1>
        <table class="center">
            <tr>
                <th>Id</th>
                <th>Company_id</th>
                <th>Student_id()</th>
                <th>Status</th>
                <th>Date début</th>
                <th>Date fin</th>
                <th>Panneau de contrôle</th>
            </tr>

            <% if (listContractsByCompanyId != null) {
                    for (Contract c : listContractsByCompanyId) {
                       // for (Student s : listStudents) {

                        //    if (s.getId() == c.getStudent_id()) {%>
            <tr>
                <!-- 
                <td><//%=//s.getFirstname()%></td>
                <td> <//%=//s.getLastname()%> </td>
                <td><//%=//s.getDa()%> </td>
                -->
                <td><%=c.getId()%></td>
                <td><%=c.getCompany_id()%></td>
                <td><%=c.getStudent_id()%></td>
                <td><%=c.getStatus()%></td>
                <td><%=c.getStart_date()%></td>
                <td><%=c.getEnd_date()%></td>
                <td>
                    <button type="button">Voir détails</button>
                </td>
            </tr>

            <%}
                  //  }
              //  }
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


        <h1>TEST FIND ALL COMPANY</h1>
        <!-- //int id, String name, String phone, String email, String personInCharge -->
        <table class="center">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>phone</th>
                <th>email</th>
                <th>personInCharge</th>
            </tr>

            <% if (listCompanyDAO != null) {
                    for (Company c : listCompanyDAO) {
            %>
            <tr>
                <td><%=c.getId()%></td>
                <td><%=c.getName()%></td>
                <td><%=c.getPhone()%></td>
                <td><%=c.getEmail()%></td>
                <td><%=c.getPersonInCharge()%></td>

            </tr>

            <%}
            } else {%>

            <tr>listCompanyDAO est <%=listCompanyDAO%></tr>
            <%}%>

        </table>

            <h1>TEST FIND CONTRACTS BY ID</h1>
            
            <p>
            <ul>COMPAGNIE:</ul>
            <li><%=comp.getId()%></li>
            <li><%=comp.getName()%></li>
            <li><%=comp.getPhone()%></li>
            <li><%=comp.getEmail()%></li>
            <li><%=comp.getPersonInCharge()%></li>
            </p>


    </body>
</html>
