<%-- 
    Document   : Showrecipes
    Created on : 19-09-2017, 14:05:04
    Author     : Bo Henriksen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        Opskrift Navn = <%= request.getAttribute("name") %> 
        <br>
        Ingredienser = <%= request.getAttribute("ingredients") %>
        <br>
        Instruktioner = <%= request.getAttribute("instruct") %> 
        <br>
        
        
        
        
        
    </body>
</html>
