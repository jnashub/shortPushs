<%@ include file="./common/header.jspf" %>
<title>owners-page</title>
<%@ include file="./common/navigation.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <br><br>
    <c:choose>
        <c:when test="${owners.isEmpty()}"><Strong>Not found !!!</Strong><br></c:when>
        <c:otherwise>
            <h3>Owners:</h3><br>
            <table class="table table-striped">
                <thead>
                <tr bgcolor="black">
                    <td><span style="color:white">Name</span></td>
                    <td><span style="color:white">Address</span></td>
                    <td><span style="color:white">City</span></td>
                    <td><span style="color:white">Telephone</span></td>
                    <td><span style="color:white">Pets</span></td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${owners}" var="to">
                    <tr>
                        <td><a class="nav-link" href="/detail/${to.id}">${to.firstName} ${to.lastName}</a></td>
                        <td>${to.address}</td>
                        <td>${to.city}</td>
                        <td>${to.telephone}</td>
                        <td><c:forEach items="${to.getPets()}" var="pet">${pet.getName()}<br></c:forEach></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:otherwise>
    </c:choose>
</div>
</html>