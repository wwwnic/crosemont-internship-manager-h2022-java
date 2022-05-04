<%-- 
    Document   : login
    Created on : Apr 3, 2022, 9:54:57 AM
    Author     : Brune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 

        <title>Login page</title>
    </head>
    <body>
        <div class="centerscreen">
            <h2>Connexion</h2>
            <br/>
            <form>
                <div class="form-group row">
                    <label for="uid" class="col-4 col-form-label">Identifiant</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-user-circle-o"></i>
                                </div>
                            </div> 
                            <input id="uid" name="uid" type="text" class="form-control" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="pw" class="col-4 col-form-label">Mot de passe</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-key"></i>
                                </div>
                            </div> 
                            <input id="pw" name="pw" type="password" required="required" class="form-control">
                        </div>
                    </div>
                </div> 
                <div class="form-group row">
                    <div class="offset-4 col-8">
                        <button name="submit" type="submit" class="btn btn-primary">Se connecter</button>
                    </div>
                </div>
            </form> 
        </div>
    </body>
</html>





