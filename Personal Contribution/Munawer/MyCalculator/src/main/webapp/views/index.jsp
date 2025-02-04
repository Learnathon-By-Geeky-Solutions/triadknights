<%@page language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container">
    <h2>Calculator</h2>
    <!-- Form should use POST method to send data -->
    <form action="calculate" method="POST">
        <div class="input-group">
            <label for="num1">Enter First Number:</label>
            <input type="text" id="num1" name="num1" required>
        </div>

        <div class="input-group">
            <label for="num2">Enter Second Number:</label>
            <input type="text" id="num2" name="num2" required>
        </div>

        <div class="operations">
            <label><input type="radio" name="operation" value="add" required> Addition ( + )</label><br>
            <label><input type="radio" name="operation" value="subtract"> Subtraction ( - )</label><br>
            <label><input type="radio" name="operation" value="multiply"> Multiplication ( * )</label><br>
            <label><input type="radio" name="operation" value="divide"> Division ( / )</label><br>
        </div>

        <input type="submit" class="btn" value="Calculate">
    </form>
</div>
</body>
</html>
