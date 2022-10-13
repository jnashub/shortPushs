<%@ include file="./common/header.jspf" %>
<title>vets-list-page</title>
<%@ include file="./common/navigation.jspf" %>
<body>
<div class="container">
    <br><br>
    <h3>Veterinarians:</h3><br><br>
    <table class="table table-striped">
        <thead>
        <tr bgcolor="black">
            <td><span style="color:white">Name</span></td>
            <td><span style="color:white">Speciality</span></td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${vets}" var="vet">
            <tr>
                <td>${vet.firstName} ${vet.lastName}</a></td>
                <td>${vet.speciality}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>