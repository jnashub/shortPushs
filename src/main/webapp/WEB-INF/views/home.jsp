<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
    <link href="${pageContext.request.contextPath}/resources/css/style.css"
          rel="stylesheet">
    <script src="${pageContext.request.contextPath}/resources/js/sample.js"></script>
</head>
<body>
<h1>Hi this style is defined in css file</h1>

<p>The time on the server is ${serverTime}.</p>

<br>
<br>

<img
        src="${pageContext.request.contextPath}/resources/images/me.jpg"/>

<br>
<br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>

</body>
</html>