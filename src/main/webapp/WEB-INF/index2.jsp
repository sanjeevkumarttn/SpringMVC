
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form method="post" action="/student/submitForm.html">
        ${heading}<hr></br>
        <label>Firstname</label>
        <input name="firstname" type="text">
        <br>
        <br>
        <label>Lastname</label>
        <input name="lastname" type="text">
        <br>
        <br>
        <input type="submit">


    </form>
</center>
</body>
</html>
