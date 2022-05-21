<%-- 
    Document   : dashbord
    Created on : 2022-03-20, 13:15:59
    Author     : Nicolas Brunet
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="./static/css/dashboard.css" /> 
        <link rel="stylesheet" type="text/css" href="./static/css/imgCenter.css" /> 
        <c:if test="${sessionScope.type=='admin'}"><%@include file="../admin/header.html" %>
        </c:if>  
        <c:if test="${sessionScope.type=='teacher'}"><%@include file="../teacher/header.html" %>
        </c:if>          
        <title>Dashboard</title>
    </head>
    <body>
        </br>
        <div class="wrapper">
            <div></div>  
            <div>
                <div>
                    <p id="pagetitle">Informations de l'enseignant</p>
                    <div class='line'>
                        </br>
                        <p id="elementname">Nom</p>
                        <p id="element"><c:out value = "${fname}"/> <c:out value = "${lname}"/></p>
                        </br>
                    </div>
                    <br/>
                </div>
                <div class="row">
                    <div class="column btncontainer">
                        <a href="showTeacherForm?id=<c:out value = "${id}"/>" data-toggle="tooltip" title="Modifier">
                            <button class="btnBlue btncenter">Modifier</button>
                        </a>
                    </div>
                    <div class="column btncontainer">
                        <a href="deleteTeacher?id=<c:out value = "${id}"/>" data-toggle="tooltip" title="Supprimer le compte">
                            <button class="btnRed btncenter">Supprimer</button>
                        </a>
                    </div>
                </div>
            </div>
            <div></div>    
        </div>    
    </body>
</html>
