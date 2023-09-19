<%-- 
    Document   : ListeEtudutiantsjsp
    Created on : Jun 19, 2023, 8:51:58 AM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1> ${mess}</h1>
         
        <c:forEach items = "${lstEtudiants}" var ="c">
            ${c.id} || ${c.name}
            <a href="<c:url value = '/EtudiantController?id=${c.id}&act=delete' />" >delete</a> <br><!-- comment -->
            <a href="<c:url value = '/EtudiantController?id=${c.id}&act=update' />" >update</a> <br><!-- comment -->
            <br><!-- comment -->
            
        </c:forEach>
       
            <a href =" <c:url value ='/student_form' /> " > Add student Form</a>
    </body>
</html>
