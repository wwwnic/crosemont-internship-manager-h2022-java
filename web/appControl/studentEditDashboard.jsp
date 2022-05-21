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
                    <p id="pagetitle">Informations de l’étudiant</p>
                    <div class='line'>
                        </br>
                        <p id="elementname">Nom</p>
                        <p id="element"><c:out value = "${student.firstname}"/> <c:out value = "${student.lastname}"/></p>
                        </br>
                        <p id="elementname">DA</p>
                        <p id="element"><c:out value = "${student.da}"/></p>
                        </br>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="column btncontainer">
                            <a href="showStudentForm?id=<c:out value = "${student.id}"/>" data-toggle="tooltip" title="Modifier">
                                <button class="btnBlue btncenter">Modifier</button>
                            </a>
                        </div>
                        <div class="column btncontainer">
                            <a href="deleteStudent?id=<c:out value = "${student.id}"/>" data-toggle="tooltip" title="Supprimer le compte">
                                <button class="btnRed btncenter">Supprimer</button>
                            </a>
                        </div>
                    </div>
                    </br>
                    <h2 id="elementname" class="text-center">Curriculum vitae</h2>
                    <div class="row">
                        <div class="column">
                            <a href="uploadCV?id=<c:out value = "${student.id}"/>" data-toggle="tooltip" title="donner un cv">
                                <img src="./static/images/Uploadfile.png" width="25%" alt="PDF">
                            </a>

                        </div>
                        <div class="column">
                            <a href="showCV?id=<c:out value = "${student.id}"/>" data-toggle="tooltip" title="voir votre dv">

                                <img src="./static/images/PDF.png" width="25%" alt="PDF2">
                            </a>

                        </div>
                    </div>
                    <h2 class="text-center">Lettre de motivation</h2>
                    <div class="row">
                        <div class="column">
                            <a href="uploadLetter?id=<c:out value = "${student.id}"/>" data-toggle="tooltip" title="donner une lettre">
                                <img src="./static/images/Uploadfile.png" width="25%" alt="PDF">
                            </a>
                        </div>
                        <div class="column">
                            <a href="showLetter?id=<c:out value = "${student.id}"/>" data-toggle="tooltip" title="voir votre lettre">
                                <img src="./static/images/PDF.png" width="25%" alt="PDF2">
                            </a>
                        </div>
                    </div>
                </div>
                </br>
                <h2 class='text-center'>Requêtes de l'étudiant</h2>
                </br>
                <table>
                    <tr>
                        <th>Nom entreprise</th>
                        <th>Id</th>
                        <th>État</th>
                        <th>Date début</th>
                        <th>Date fin</th>
                        <th></th>
                    </tr>
                    <tr>
                        <c:forEach items="${lstContRelation}" var="contRel">
                        <tr>
                            <td><c:out value = "${contRel.company.name}"/></td>
                            <td><c:out value = "${contRel.contract.id}"/></td>
                            <td><c:out value = "${contRel.contract.status}"/></td>
                            <td><fmt:formatDate pattern = "yyyy-MM-dd" value = "${contRel.contract.start_date}" /></td>
                            <td><fmt:formatDate pattern = "yyyy-MM-dd" value = "${contRel.contract.end_date}" /></td>
                            <td>
                                <a href="showContract?id=<c:out value = "${contRel.contract.id}"/>" data-toggle="tooltip" title="Voir le contrat">
                                    <button class="buttonForTable">Visualiser</button>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tr>
                </table>
                </br>
                </br>
            </div>    
            <div></div>    
    </body>
</html>
