<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="./common/header.jspf" %>
<title>add-pet-page</title>
</head>
<body class="container">
<br><br>
<h3>New Visit:</h3>
<br>
<div class="row">
    <div class="col-md-1"></div>
    <div class="col">
        <div class="container">
            <form:form action="/detail/${idOwner}/visitAdded/${idPet}" method="POST" modelAttribute="visit">
                <div class="row">
                    <label class="col-md-3"><strong>Date</strong>(MM/dd/YYYY)<strong>:</strong></label>
                    <form:input class="col-md-8" path="date"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-3"><strong>Description:</strong></label>
                    <form:textarea class="col-md-8" path="description"/>
                </div>
                <br>
                <div class="row">
                    <label class="col-md-2"></label>
                    <span class="col-md-8">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button
                            class="btn btn-dark" type="submit">Add Visit</button></span>
                </div>
            </form:form>
        </div>
    </div>
</div>
</div>
</body>
</html>