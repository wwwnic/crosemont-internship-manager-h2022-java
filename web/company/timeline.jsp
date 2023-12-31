<%-- 
    Document   : timeline
    Created on : 2022-04-09, 22:03:09
    Author     : melis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./static/css/timeline.css" />
    </head>
    <body>
        <%-- 
            source: https://www.w3schools.com/howto/howto_css_timeline.asp
        --%>

        <div class="timeline">
            <div class="containerTimeline left">
                <div class="content">
                    <h2 class="textWhite">Postule</h2>
                    <p class="textWhite">L'étudiant postule à votre stage ou emploi</p>
                </div>
            </div>
            <div class="containerTimeline right">
                <div class="content">
                    <h2 class="textWhite">Entrevue</h2>
                    <p class="textWhite">Vous le passez en embauche</p>
                </div>
            </div>
            <div class="containerTimeline left">
                <div class="content">
                    <h2 class="textWhite">Contrat</h2>
                    <p class="textWhite">Vous signez un contrat avec lui</p>
                </div>
            </div>
        </div>
    </body>
</html>
