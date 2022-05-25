<%-- 
    Document   : addInternshipForm
    Created on : 2022-05-25, 04:32:01
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
        <h1 class="center">Publier un stage</h1>
        <br/>
        <div class="centerAddAds">
            <form method="get" action="addInternship">
                <div class="form-group row">
                    <label for="titreI" class="col-4 col-form-label">Titre du stage</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-briefcase"></i>
                                </div>
                            </div> 
                            <input id="titreI" name="titreI" placeholder="Titre" type="text" required="required" class="form-control">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="descI" class="col-4 col-form-label">Description du stage</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-align-justify"></i>
                                </div>
                            </div> 
                            <input id="descI" name="descI" placeholder="Description" type="text" required="required" class="form-control">
                        </div>
                    </div>
                </div>

                <!-- 
                <div class="form-group row">
                    <div class="row">                                    
                        <div class="column inputcontainer">                                        
                            <label id="label" for="from">Date de début : </label>                                        
                            <input class="form-control"  placeholder="aaaa-mm-jj" type="text" id="from"  required="required" name="debutI" class="form-control">                                       
                        </div>                                    
                        <div class="column inputcontainer">                                        
                            <label id="label" for="to">Date de fin : </label>                                        
                            <input class="form-control"  placeholder="aaaa-mm-jj" type="text" id="to" required="required" name="finI"class="form-control">                                       
                        </div>                                
                    </div>
                </div>
                -->
                
                
                
                <div class="form-group row">
                    <label for="from" class="col-4 col-form-label">Date de début</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-calendar"></i>
                                </div>
                            </div> 
                            <input id="from" name="debutI" placeholder="aaaa-mm-jj" type="text" required="required" class="form-control">
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
                            <input id="to" name="finI" placeholder="aaaa-mm-jj" type="text" required="required" class="form-control">
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
