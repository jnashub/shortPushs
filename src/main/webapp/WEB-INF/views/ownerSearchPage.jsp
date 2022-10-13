<%@ include file="./common/header.jspf" %>
<%@ include file="./common/navigation.jspf" %>
<br><br>
<title>owner-search-page</title>
</head>
<div class="container">
    <h3>Find Owners</h3><br>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col">
            <div class="container">
                <form action="/owners" method="POST">
                    <div clas="container">
                        <div clas="row">
                            <label class="col-md-1"><strong>Last name:</strong></label>
                            <input class="col-md-6" type="text" name="lastName"
                                   placeholder="owner's lastname and/or press the button"/>
                        </div>
                        <br>
                        <div class="row">
                            <span class="col-md-1"></span><span class="col-md-2"><button type="submit"
                                                                                         class="btn btn-dark">Find Owner</button></span>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <br><br>
    <div class="row">
        <span class="col-sm-2"><a class="btn btn-dark" href="/addOwner">Add Owner</a></span>&nbsp;&nbsp;
        <span class="col-sm-2"><a class="btn btn-dark" href="/vets">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Vets&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></span>
    </div>
</div>
</html>