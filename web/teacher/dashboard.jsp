<%-- 
    Document   : dashbord
    Created on : 2022-03-20, 13:15:59
    Author     : Nicolas Brunet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dashboard.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/table.css" /> 

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>


        <title>JSP Page</title>
    </head>
    <body>
        <div class="wrapper">
            <div></div> 
            <div>
                <div>
                    <div class='line'>
                        <p id="elementname">Nom</h2>
                        <p id="element"><%=request.getAttribute("name")%></p>
                        </br>
                        <p id="elementname">Téléphone</p>
                        <p id="element"><%=request.getAttribute("phone")%></p>
                        </br>
                        <p id="elementname">Courriel</p>
                        <p id="element"><%=request.getAttribute("email")%></p>
                        </br>
                        <p id="elementname">Personne en charge</p>
                        <p id="element"><%=request.getAttribute("personInCharge")%></p>
                    </div>
                    <div class="container center">
                        <h1>Liste des canditures</h1>

                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Firstname</th>
                                    <th>Lastname</th>
                                    <th>Email</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>John</td>
                                    <td>Doe</td>
                                    <td>john@example.com</td>
                                </tr>
                                <tr>
                                    <td>Mary</td>
                                    <td>Moe</td>
                                    <td>mary@example.com</td>
                                </tr>
                                <tr>
                                    <td>July</td>
                                    <td>Dooley</td>
                                    <td>july@example.com</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                </div>
                <div></div>    
            </div>    

    </body>
</html>
