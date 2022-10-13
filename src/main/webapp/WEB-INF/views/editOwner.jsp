<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="./common/header.jspf" %>
<title>edit-owner-page</title>
</head>
<body class="container">
<br><br>
<h3>Add New Owner:</h3><br>
<br>
<div class="row">
    <div class="col-md-1"></div>
    <div class="col">
        <div class="container">
            <form:form action="/detail/${id}/editOwner" method="POST" modelAttribute="owner">
                <div class="row">
                    <label class="col-md-3"><strong>First name:</strong></label>
                    <form:input class="col-md-8" path="firstName"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-3"><strong>Last name:</strong></label>
                    <form:input class="col-md-8" path="lastName"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-3"><strong>Address:</strong></label>
                    <form:input class="col-md-8" path="address"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-3"><strong>City:</strong></label>
                    <form:input class="col-md-8" path="city"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-3"><strong>Telephone:</strong></label>
                    <form:input class="col-md-8" path="telephone"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-2"></label>
                    <span class="col-md-8">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button
                            class="btn btn-dark" type="submit">Update Owner</button></span>
                </div>
            </form:form>
        </div>
    </div>
</div>
</div>
</body>
</html>