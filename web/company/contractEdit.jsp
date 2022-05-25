<%-- 
    Document   : contractEdit
    Created on : 2022-05-23, 01:17:09
    Author     : melis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <%@include file="../company/header.html" %>
        
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <script src="./static/js/calenderFrench.js"></script>
        
        
        <title>JSP Page</title>
        
        <style>
            body {
                text-align: center;
            }
            form {
                display: inline-block;
            }
            .centerDashboard {
                font-size: 20px;
            }
        </style>
    </head>
    <body>

        <h1 class="center">Modifier le contrat</h1>
        </br>

        <div class="centerDashboard">
                    
            <form method="get" action="contractEdit?idC=${idC}">
                <p>id du contrat : ${idC}</p>
                </br>
                <input type="hidden" id="id" name="idC" value=<c:out value="${idC}" />>
                </br>
        
                
                
                
                
                
                <div class="form-group row">
                    <label for="from" class="col-4 col-form-label">Date de début</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-calendar"></i>
                                </div>
                            </div> 
                            <input id="from" name="dateDebut" placeholder="aaaa-mm-jj" type="text" required="required" class="form-control">
                        </div>
                    </div>
                </div>
                
                
                <div class="form-group row">
                    <label for="to" class="col-4 col-form-label">Date de fin</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-calendar"></i>
                                </div>
                            </div> 
                            <input id="to" name="dateFin" placeholder="aaaa-mm-jj" type="text" required="required" class="form-control">
                        </div>
                    </div>
                </div> 
                
                
                
                
                
                
                
                <div class="form-group row">
                    <div class="offset-4 col-8">
                        <button name="submit" type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>


        </div>
    </body>
</html>
