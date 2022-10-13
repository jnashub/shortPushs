<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="./common/header.jspf" %>
<title>add-pet-page</title>
</head>
<body>
<div class="container">
    <br><br><br>
    <h3>Edit Pet:</h3>
    <br>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col">
            <div class="container">
                <div class="row">
                    <span class="col-md-3"><strong>Onwer:</strong></span>
                    <span class="col-md-8">${theOwner}</span>
                </div>
                <br>
                <form:form action="/detail/${idOwner}/editPet/${idPet}" method="POST" modelAttribute="pet">
                    <div class="row">
                        <label class="col-md-3"><strong>Name:</strong></label>
                        <form:input class="col-md-8" path="name"/>
                    </div>
                    <br>
                    <div class="row">
                        <label class="col-md-3"><strong>Birth Date</strong>(MM/dd/YYYY)<strong>:</strong></label>
                        <form:input class="col-md-8" path="dateOfBirth"/>
                    </div>
                    <br>
                    <div class="row">
                        <label class="col-md-3"><strong>Type:</strong></label>
                        <form:select class="col-md-8" path="petType" items="${types}"/>
                    </div>
                    <br>
                    <br>
                    <div class="row">
                        <label class="col-md-2"></label>
                        <span class="col-md-8">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button
                                class="btn btn-dark" type="submit">Update Pet</button></span>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>