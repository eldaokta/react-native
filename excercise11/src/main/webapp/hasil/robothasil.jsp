<%@ page contentType ="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Robot</title>
</head>
<body>
    <%
        String position = (String) request.getAttribute("position");
    %>

    <h1>Hasilnya: <%= position %></h1>



</body>
</html>
