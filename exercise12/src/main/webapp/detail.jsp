<%@ page import="com.enigma.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 10/3/2019
  Time: 12:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<body>
<%
        Student student = (Student) request.getAttribute("detail");
%>
<div class="container">
    <div class="card" style="width: 18rem">
        <div class="card-body">
            <h5 class="card-title">Student Detail</h5>
            <p class="card-text"><%= student.getName()%></p>
            <p class="card-text"><%= student.getBirthPlace()%></p>
            <p class="card-text"><%= student.getBirthDate()%></p>
            <p class="card-text"><%= student.getGender()%></p>

        </div>
    </div>
</div>
</body>
</html>
