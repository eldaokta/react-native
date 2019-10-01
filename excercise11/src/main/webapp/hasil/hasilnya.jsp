<%@ page contentType ="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hasil</title>
</head>
<body>
    <%
        String result = (String) request.getAttribute("result");
        result = result + "yaaaaa";
    %>

    <h1>Hasilnya: <%= result %></h1>



</body>
</html>
