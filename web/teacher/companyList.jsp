<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/center.css" /> 
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/table.css" /> 

        <%@include file="../teacher/header.html" %>
        <title>Liste des entreprises</title>
    </head>
    <body>
        <div class="wrapper">
            <div></div>  
            <div>
                <h1 class="center">Liste des entreprises</h1>
                <div class="find">
                    <input class="form-control" type="text" placeholder="Recherche">
                </div>
                <br/>
                <div  align="center" class="container">
                    <table>
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nom</th>
                                <th> </th>
                                <th></th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listCompany}" var="comp">
                                <tr>
                                    <td><c:out value = "${comp.id}"/></td>
                                    <td><c:out value = "${comp.name}"/></td>
                                    <td> </td>
                                    <td>
                                        <a href="#" data-toggle="tooltip" title="Tableau de bord">
                                            <svg width="37" height="37" viewBox="0 0 18 18" fill="none" xmlns="http://www.w3.org/2000/svg" >
                                            <path d="M0 2V16C0 17.1 0.89 18 2 18H16C17.1 18 18 17.1 18 16V2C18 0.9 17.1 0 16 0H2C0.89 0 0 0.9 0 2ZM12 6C12 7.66 10.66 9 9 9C7.34 9 6 7.66 6 6C6 4.34 7.34 3 9 3C10.66 3 12 4.34 12 6ZM3 14C3 12 7 10.9 9 10.9C11 10.9 15 12 15 14V15H3V14Z" fill="#0A98E8"/>
                                            </svg>
                                        </a>
                                    </td>
                                    <td>
                                        <a href="#" data-toggle="tooltip" title="Modifier">
                                            <svg width="37" height="37" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M0 14.2525V18.0025H3.75L14.81 6.9425L11.06 3.1925L0 14.2525ZM17.71 4.0425C18.1 3.6525 18.1 3.0225 17.71 2.6325L15.37 0.2925C14.98 -0.0975 14.35 -0.0975 13.96 0.2925L12.13 2.1225L15.88 5.8725L17.71 4.0425V4.0425Z" fill="#0A98E8"/>
                                            </svg>
                                        </a>
                                    </td>
                                    <td>
                                        <a href="#" data-toggle="tooltip" title="Supprimer le compte">
                                            <svg width="37" height="37" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M1 16C1 17.1 1.9 18 3 18H11C12.1 18 13 17.1 13 16V4H1V16ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#ff3232"/>
                                            </svg>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div></div>
                </div> 
            </div> 
        </div> 
    </body>
</html>
