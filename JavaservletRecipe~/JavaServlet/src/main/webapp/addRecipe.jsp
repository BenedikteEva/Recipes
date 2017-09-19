<%-- 
    Document   : addRecipe
    Created on : 19-09-2017, 09:45:59
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
        <h1>Recipe World!</h1>
        
        <p>Add your recipe.</p>
        
        <form name="Form1" action="RecipeControler" method="POST">
            Name<br>
            <input type="text" name="recipeName" value="Recipe Name" />
            <input type="hidden" name="name" value="Data from the hidden field" />
            <br>
            <br>
            Ingredienser<br>
            <textarea type="text" name="ingredients" value="ingredienses"></textarea>
            
            <br>
            <br>
            Instructions<br>
            <textarea type="text" name="instructions" value="instructions"></textarea>
            
            <input type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
