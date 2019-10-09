<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<html>
<head>
    <title>View</title>

</head>

<body>

<div class="container">
    <h1 align="center">List Artist</h1>
    <a href="artist-form"><button type="button" class="btn btn-primary">Add Artist</button></a>
    <a href="song"><button type="button" class="btn btn-primary">Add Song</button></a>
    <table class="table table-bordered">
        <thead>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Debut</th>
            <th scope="col">Born Place</th>
            <th scope="col">Action</th>
        </thead>
        <tbody>
        <c:forEach items="${artistList}" var="artist">
            <tr>
                <td><c:out value="${artist.idArtist}"></c:out></td>
                <td><c:out value="${artist.name}"></c:out></td>
                <td><c:out value="${artist.debut}"></c:out></td>
                <td><c:out value="${artist.bornPlace}"></c:out></td>
                <td text-align="center"><a href="detail?id=${artist.idArtist}">Detail</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>