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
            <div></div>    
    </body>
</html>
