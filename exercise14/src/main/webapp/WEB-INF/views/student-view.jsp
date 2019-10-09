<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View</title>

</head>

<body>
    <h1>Ini student ${message}</h1>
    <h1>id : ${x.id}</h1>
    <h1>name : ${x.name}</h1>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td><c:out value="${student.id}"></c:out></td>
                <td><c:out value="${student.name}"></c:out></td>
            </tr>
        </c:forEach>
    </tbody>
    
    
</table>
</body>
</html>