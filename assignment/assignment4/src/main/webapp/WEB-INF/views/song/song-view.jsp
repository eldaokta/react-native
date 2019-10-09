<%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 10/8/2019
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Song</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 align="center">List Songs</h1>
    <a href="/song/song-form"><button type="button" class="btn btn-primary">Add Song</button></a>
    <table class="table table-bordered">
        <thead>
            <th scope="col">Id Song</th>
            <th scope="col">Title Song</th>
            <th scope="col">Artis Name</th>
        </thead>
        <c:forEach items="${listSong}" var="song">
        <tbody>
            <td><c:out value="${song.idSong}"></c:out></td>
            <td><c:out value="${song.titleSong}"></c:out></td>
            <td><c:out value="${song.artist.name}"></c:out></td>
        </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>
