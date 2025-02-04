<%@page language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="result-container">
    <h2 class="result-text"> ${message} </h2> <!-- Displays operation type like "Addition Result:" -->
    <h2 class="result-text"> <span> ${result} </span></h2> <!-- Displays the computed result -->

    <a href="/" class="back-btn">Back to Calculator</a>
</div>
</body>
</html>
