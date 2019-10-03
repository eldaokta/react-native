<%--
  Created by IntelliJ IDEA.
  User: Enigmacamp
  Date: 10/3/2019
  Time: 1:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2 text-align="center">Detail Student</h2>
<form method="post" action="addstudent.php">
    <div class="form-group">
        <label for="id">Id</label>
        <input type="text" name="id" class="form-control" id="id"  placeholder="Enter Id">
    </div>
    <div class="form-group">
        <label for="name">Name</label>
        <input type="text" name="name" class="form-control" id="name"  placeholder="Enter Name">
    </div>
    <div class="form-group">
        <label for="birth_place">Birth Place</label>
        <input type="text" name="birth_place" class="form-control" id="birth_place"  placeholder="Enter Birth Place">
    </div>
    <div class="form-group">
        <label for="birth_date">Birth Date</label>
        <input type="date" name="birth_date" class="form-control" id="birth_date"  placeholder="Enter Birth Date">
    </div>
    <div class="form-group">
        <label for="gender">Birth Gender</label>
        <select id="gender" name="gender" class="form-control">
            <option selected>Choose...</option>
            <option>Male</option>
            <option>Female</option>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>
