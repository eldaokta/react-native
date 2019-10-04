<%@ page import="com.enigma.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 10/2/2019
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
    <form action="student-submit" method="post">
        <input type="text" name="id"/>
        <input type="text" name="name"/>
        <input type="submit"/>
    </form>

    <h1>Ini Student</h1>

    <table>
        <tr>
            <th>${id}</th>
            <th>${name}</th>
        </tr>

        <c:forEach items="${tambah}" var="data">

        <tr>
            <td><c:out value="${data.id}"></c:out></td>
            <td><c:out value="${data.name}"></c:out></td>
        </tr>

        </c:forEach>
    </table>

</body>
</html>