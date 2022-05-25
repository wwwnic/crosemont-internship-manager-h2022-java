<%-- 
    Document   : addJobForm
    Created on : 2022-05-25, 04:12:50
    Author     : melis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <%@include file="../company/header.html" %> 
        
        <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
        <script src="./static/js/calenderFrench.js"></script>

        <title>Form</title>

        <style>
            body {
                text-align: center;
            }
            form {
                display: inline-block;
            }
            .centerAddAds {
                font-size: 25px;
            }
        </style>
    </head>
    <body>
        <br/>
        <h1 class="center">Publier un emploi</h1>
        <br/>
        <div class="centerAddAds">
            <form method="get" action="addJob">
                <div class="form-group row">
                    <label for="titreJ" class="col-4 col-form-label">Titre de l'emploi</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-briefcase"></i>
                                </div>
                            </div> 
                            <input id="titreJ" name="titreJ" placeholder="Titre" type="text" required="required" class="form-control">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="descJ" class="col-4 col-form-label">Description de l'emploi</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-align-justify"></i>
                                </div>
                            </div> 
                            <input id="descJ" name="descJ" placeholder="Description" type="text" required="required" class="form-control">
                        </div>
                    </div>
                </div>
                
                
                
                
                <div class="form-group row">
                    <label for="from" class="col-4 col-form-label">Date de début</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-calendar"></i>
                                </div>
                            </div> 
                            <input id="from" name="debutJ" placeholder="aaaa-mm-jj" type="text" required="required" class="form-control">
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
                            <input id="to" name="finJ" placeholder="aaaa-mm-jj" type="text" required="required" class="form-control">
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
