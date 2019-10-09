<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>Input Data</h1>
<fmt:form method="post" modelAttribute="student">
    <fmt:input path="id"/>
    <fmt:input path="name"/>
    <input type="submit"/>
</fmt:form>
</body>
</html>