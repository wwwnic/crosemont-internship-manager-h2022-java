<%-- 
    Document   : editDashboard
    Created on : 2022-05-22, 18:53:28
    Author     : melis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <%@include file="../company/header.html" %>
        <title>Edit Dashboard</title>

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

        <h1 class="center">Modifier la compagnie</h1>
        </br>

        <div class="centerDashboard">

            <div>id de la compagnie : ${idConnecte}</div>
            
            <form method="get" action="">
                <div class="form-group row">
                    <label for="nomC" class="col-4 col-form-label">Nom de l'entreprise :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-building"></i>
                                </div>
                            </div> 
                            <input id="nomC" name="nomC" placeholder="nom " type="text" class="form-control" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="telC" class="col-4 col-form-label">Numéro de téléphone:</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-phone"></i>
                                </div>
                            </div> 
                            <input id="telC" name="telC" placeholder="téléphone" type="text" class="form-control" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="courrielC" class="col-4 col-form-label">Courriel de l'entreprise</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-at"></i>
                                </div>
                            </div> 
                            <input id="courrielC" name="courrielC" placeholder="courriel" type="text" class="form-control" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="personneC" class="col-4 col-form-label">Nom de la personne à contracter</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-user"></i>
                                </div>
                            </div> 
                            <input id="personneC" name="personneC" placeholder="personne" type="text" class="form-control" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4 col-form-label" for="mdpC">Mot de passe</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-align-justify"></i>
                                </div>
                            </div> 
                            <input id="mdpC" name="mdpC" placeholder="mot de passe" type="text" class="form-control" required="required">
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
