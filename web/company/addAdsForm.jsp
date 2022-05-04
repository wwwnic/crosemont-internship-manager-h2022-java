<%-- 
    Document   : addAdsForm
    Created on : 2022-04-16, 18:40:38
    Author     : melis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <%@include file="../company/header.html" %>
        <link rel="stylesheet" href="/resources/demos/style.css">

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
        <h1 class="center">Publier une publicité</h1>
        <br/>
        <div class="centerAddAds">
            <form>
                <div class="form-group">
                    <label for="adsTitle">Titre</label> 
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <i class="fa fa-align-center"></i>
                            </div>
                        </div> 
                        <input id="adsTitle" name="adsTitle" placeholder="titre" type="text" required="required" class="form-control">
                    </div>
                </div>
                <br/>
                <div class="form-group">
                    <label for="textDesc">Courte Description</label> 
                    <textarea id="textDesc" name="textDesc" cols="40" rows="3" aria-describedby="textDescHelpBlock" required="required" class="form-control"></textarea> 
                    <span id="textDescHelpBlock" class="form-text text-muted">Écrivez une description pour votre publicité</span>
                </div>
                <br/>
                <div class="form-group">
                    <button name="uploadImage" type="button" class="btn btn-primary">Insérer une image</button>
                </div>
                <br/>
                <div class="form-group">
                    <button name="submit" type="submit" class="btn btn-primary">Publier</button>
                </div>
            </form>
            
            <h4>Vous pouvez voir et modifier vos publicités dans votre tableau de bord</h4>
        </div>
    </body>
</html>
