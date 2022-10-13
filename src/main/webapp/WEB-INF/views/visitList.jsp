<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Users</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

</head>

<body onload="load();">
<input type="hidden" id="user_id">
Name: <input type="text" id="name" required="required" name="user_name"><br>
Email: <input type="email" id="email" required="required" name="email"><br>
<button onclick="submit();">Submit</button>

<table id="table" border=1>
    <tr>
        <th> Name</th>
        <th> Email</th>
        <th> Edit</th>
        <th> Delete</th>
    </tr>

</table>

<img src="<c:url value="/resources/images/boite.jpg"></c:url>"/>
<img src="<c:url value="/resources/images/055.png"></c:url>"/>
<img src="/resources/images/055.png" rel="connerie!"/>
</body>
</html>
