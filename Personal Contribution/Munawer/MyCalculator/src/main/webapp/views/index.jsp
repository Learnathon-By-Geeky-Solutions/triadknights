<%@page language="java" %>

<html>
    <head>
        <link rel = "stylesheet" type = "text/css" href="style.css">
    </head>
    <body>
        <h2> My Calculator </h2>
        <form action = "add">
            <label for = "num1"> Enter First Number : </label>
            <input type = "text" id = "num1" name = "num1"> <br>
            <label for = "num2"> Enter Second Number : </label>
            <input type = "text" id = "num2" name = "num2"> <br>
            <input type = "submit" value = "Addition">
        </form>
    </body>
</html>