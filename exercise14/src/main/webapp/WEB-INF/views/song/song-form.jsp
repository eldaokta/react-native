<%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 10/8/2019
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Song Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 align="center">Add Song</h1>
    <fmt:form method="post" modelAttribute="song" action="/song">
        <div class="form-group">
            <label for="idSong">Id Song</label>
            <fmt:input type="text" path="idSong" class="form-control" id="idSong"  placeholder="Enter Id Song"/>
        </div>
        <div class="form-group">
            <label for="titleSong">Title Song</label>
            <fmt:input type="text" path="titleSong" class="form-control" id="titleSong"  placeholder="Enter Title Song" />
        </div>
        <div class="form-group">
            <label for="artist">Artist</label>
                <fmt:select path="artist" class="custom-select" id="artist">
                    <c:forEach items="${artistList}" var="list">
                        <fmt:option value="${list.idArtist}">${list.name}</fmt:option>
                    </c:forEach>
            </fmt:select>



        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </fmt:form>
</div>
</body>
</html>
