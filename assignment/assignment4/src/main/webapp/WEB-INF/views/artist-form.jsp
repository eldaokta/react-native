<%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 10/7/2019
  Time: 4:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Add Artist</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 align="center">Add Artist</h1>
    <fmt:form method="post" modelAttribute="artist" action="artist-form">
        <div class="form-group">
            <label for="id">Id</label>
            <fmt:input type="text" path="idArtist" class="form-control" id="id"  placeholder="Enter Id"/>
        </div>
        <div class="form-group">
            <label for="name">Name</label>
            <fmt:input type="text" path="name" class="form-control" id="name"  placeholder="Enter Name" />
        </div>
        <div class="form-group">
            <label for="debut">Debut</label>
            <fmt:input type="text" path="debut" class="form-control" id="debut"  placeholder="Enter Debut"/>
        </div>
        <div class="form-group">
            <label for="bornPlace">Born Place</label>
            <fmt:input type="text" path="bornPlace" class="form-control" id="bornPlace"  placeholder="Enter Born Place"/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </fmt:form>
</div>
</body>
</html>

