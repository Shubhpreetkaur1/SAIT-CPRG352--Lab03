<%-- 
    Document   : agecalculator
    Created on : 26-May-2022, 11:31:50 AM
    Author     : Shubhpreet Kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
             <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br>
           
            <input type="submit" name="cal" value="+">
             <input type="submit" name="cal" value="-">
              <input type="submit" name="cal"  value="*">
               <input type="submit" name="cal" value="%">
        </form>
        <p>${message}</p>
         <a href="age">Age calculator</a>
        
    </body>
</html>
