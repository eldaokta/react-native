<%@ page contentType ="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercise 11</title>
</head>
<body>
    <h2>Robot Servlet</h2>
    <form action = "robotservlet.php" method="post">
        <h3>Input Position: </h3>
        <input type="text" name="position"/>

        <h3>Input Fuel: </h3>
        <input type="text" name="fuel"/>

        <h3>Input Commands</h3>
        <input text= "text" name="commands"/>

        <br/><br/>
        <input type="submit"/>
    </form>
    <a href="hello.php?name=Elda">Hello</a>
    <a href="student.php">List Student</a>
</body>
</html>
