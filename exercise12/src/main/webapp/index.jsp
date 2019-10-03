<%@ page import="java.util.List" %>
<%@ page import="com.enigma.model.Student" %>
<%@ page contentType ="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>List Student</title>
</head>
<body>
<div class="container">
<h2 text-align="center">List Student</h2>
<%
    List<Student> students = (List<Student>) request.getAttribute("students");
%>

<a href="addstudent.php">Add Student</a>
<table class="table table-bordered">
    <thead>
        <th scope="col">No.</th>
        <th scope="col">Name</th>
        <th scope="col">Birth Place</th>
        <th scope="col">Birth Date</th>
        <th scope="col">Gender</th>
        <th scope="col">Action</th>

    </thead>
    <%
        for (Student student : students){
    %>
    <tr>
        <td><%= student.getId()%></td>
        <td><%= student.getName()%></td>
        <td><%= student.getBirthPlace()%></td>
        <td><%= student.getBirthDate()%></td>
        <td><%= student.getGender()%></td>
        <td text-align="center"><a href="detail.php?id=<%= student.getId()%>">Detail</a> </td>
    </tr>
    <%}%>
</table>
</div>
</body>
</html>
