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
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <br>
           
            <input type="submit" value="Age next birthday">
        </form>
       
        <p>${message}</p>
         <a href="arithmetic">Arithmetic calculator</a>
    </body>
</html>
