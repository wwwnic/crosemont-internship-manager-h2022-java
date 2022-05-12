<%-- 
    Document   : dashboard
    Created on : 2022-05-04, 16:12:26
    Author     : Jefferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dashboard.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/table.css" /> 
        <%@include file="../student/header.html" %>
        <title>Dashboard Student</title>
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
                        </br>     
                        <p id="elementname">Nom</h2>
                        <p id="element"><td><c:out value = "${name}"/></td>
                        </p>
                        </br>
                        <p id="elementname">DA</p>
                        <p id="element"><c:out value = "${phone}"/></p>
                        </br>                        
                        </br>
                    </div>
                    </br>
                    <div class="row">
                        <div class="column btncontainer">
                            <button class="btnBlue btncenter">Modifier</button>
                        </div>
                        <div class="column btncontainer">
                            <button class="btnRed btncenter">Supprimer</button>
                        </div>
                    </div>
                </div>
            </div>  
        </div>
        <div class="container">
            
            <div class="row justify-content-center">
                <div class="col-4">
                    <h3>Curriculum Vitae</h3>
                </div>
                <div class="col-4">
                    <h3>Lettre de motivation</h3>
                </div>
            </div>
            
            <div class="row justify-content-center">
                <div class="col-4">
                    <div class="row">
                        <div class="col-2">
                            <i class="fa-solid fa-file fa-4x "></i>
                        </div>
                        <div class="col-2">
                            <i class="fa-solid fa-file-pdf  fa-4x"></i>
                        </div>
                    </div>
                   
                </div>
               <div class="col-4">
                    <div class="row">
                        <div class="col-2">
                            <i class="fa-solid fa-file fa-4x "></i>
                        </div>
                        <div class="col-2">
                            <i class="fa-solid fa-file-pdf  fa-4x"></i>
                        </div>
                    </div>
                    
                    
                </div>
            </div>
        </div>  
                        
             <div class="wrapper">
            <div></div>  
            <div>
                <h1 class="center">Requêtes de l'étudiant</h1>
                <br/>
                <div  align="center" class="container">
                    <table>
                        <thead>
                            <tr>
                                <th>Compagnie</th>
                                <th>ID</th>
                                <th>Status</th>
                                <th>Date début</th>
                                <th>Date Fin</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listStudent}" var="stud">
                                <tr>
                                    <td>test</td>
                                    <td>test</td>
                                    <td>test</td>
                                    <td>test</td>
                                    <td>test</td>
                                    <td><button>Visualiser</button></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div> 
            </div>            
    </body>
</html>
