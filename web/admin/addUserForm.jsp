<%-- 
    Document   : userForm
    Created on : Apr 2, 2022, 6:10:56 PM
    Author     : Brune
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="./static/css/formuser.css" /> 
        <link rel="stylesheet" type="text/css" href="./static/css/center.css" /> 

        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@include file="../admin/header.html" %>
    </head>

    <body>
        <div class="wrapper">
            <div></div>  
            <div>
                <br/>
                <p class="titlelabel">Type d'utilisateur à inscrire:</p>
                <br/>
                <div class="wrapper" id="formSelector">
                    <div class="divBtnFormSelector">
                        <button onclick="displayStudent()" class="btnFormSelector btncenter active">Étudiant</button>
                    </div>
                    <div class="divBtnFormSelector">
                        <button onclick="displayTeacher()" class="btnFormSelector btncenter">Professeur</button>
                    </div>
                    <div class="divBtnFormSelector">
                        <button onclick="displayCompany()" class="btnFormSelector btncenter">Entreprise</button>
                    </div>
                </div>
                <br/>
                <script src="./static/js/formToggler.js"></script>
                <br/>
                <c:if test="${not empty msgError}">
                    <div class="alert alert-danger" role="alert">
                        <c:out value="${msgError}" />
                    </div>
                </c:if>
                <form id="formStudent" style="none" action="addStudent" method="post">
                    <div class="form-group row">
                        <label for="fname" class="col-4 col-form-label">Prenom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-badge"></i>
                                    </div>
                                </div> 
                                <input id="fname" name="fname" type="text" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="lname" class="col-4 col-form-label">Nom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-badge"></i>
                                    </div>
                                </div> 
                                <input id="lname" name="lname" type="text" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="da" class="col-4 col-form-label">Numéro étudiant</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-card-o"></i>
                                    </div>
                                </div> 
                                <input id="da" name="da" type="text" required="required" class="form-control">
                            </div>
                        </div>
                    </div> 
                    <div class="form-group row">
                        <label class="col-4 col-form-label" for="password">Mot de passe</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-key"></i>
                                    </div>
                                </div> 
                                <input id="password" name="password" type="password" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="offset-4 col-8">
                            <button name="submit" type="submit" class="btn btn-primary">Soumettre</button>
                        </div>
                    </div>
                </form>

                <form class="hidden" id="formTeacher" style="none" action="addTeacher" method="post">
                    <div class="form-group row">
                        <label for="fname" class="col-4 col-form-label">Prenom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-badge"></i>
                                    </div>
                                </div> 
                                <input id="fname" name="fname" type="text" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="lname" class="col-4 col-form-label">Nom</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-id-badge"></i>
                                    </div>
                                </div> 
                                <input id="lname" name="lname" type="text" class="form-control" required="required">
                            </div>
                        </div>
                    </div> 
                    <div class="form-group row">
                        <label class="col-4 col-form-label" for="password">Mot de passe</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-key"></i>
                                    </div>
                                </div> 
                                <input id="password" name="password" type="password" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="offset-4 col-8">
                            <button name="submit" type="submit" class="btn btn-primary">Soumettre</button>
                        </div>
                    </div>
                </form>

                <form class="hidden" id="formCompany" style="none" action="addCompany" method="post">
                    <div class="form-group row">
                        <label for="cname" class="col-4 col-form-label">Nom de l'entreprise</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-building-o"></i>
                                    </div>
                                </div> 
                                <input id="cname" name="cname" type="text" required="required" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="phone" class="col-4 col-form-label">Téléphone</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-phone"></i>
                                    </div>
                                </div> 
                                <input id="phone" name="cphone" type="text" required="required" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="email" class="col-4 col-form-label">Courriel</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-envelope-o"></i>
                                    </div>
                                </div> 
                                <input id="email" name="email" type="text" required="required" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="inCharge" class="col-4 col-form-label">Personne en charge</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-user-o"></i>
                                    </div>
                                </div> 
                                <input id="inCharge" name="personInCharge" type="text" required="required" class="form-control">
                            </div>
                        </div>
                    </div> 
                    <div class="form-group row">
                        <label class="col-4 col-form-label" for="password">Mot de passe</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">
                                        <i class="fa fa-key"></i>
                                    </div>
                                </div> 
                                <input id="password" name="password" type="password" class="form-control" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="offset-4 col-8">
                            <button name="submit" type="submit" class="btn btn-primary">Soumettre</button>
                        </div>
                    </div>
                </form>
            </div>  
            <div></div>  
        </div>
    </body>
</html>
