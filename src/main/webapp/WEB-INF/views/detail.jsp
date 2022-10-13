<%@ include file="./common/header.jspf" %>
<%@ include file="./common/navigation.jspf" %>
<aside>
    <div class="container">
        <br><br>
        <h3>Owner Information:</h3>
        <br>
        <table class="table table-striped">
            <tr>
                <th>Name</th>
                <td>${owner.firstName} ${owner.lastName}</td>
            </tr>
            <tr>
                <th>Address</th>
                <td>${owner.address}</td>
            </tr>
            <tr>
                <th>City</th>
                <td>${owner.city}</td>
            </tr>
            <tr>
                <th>Telephone</th>
                <td>${owner.telephone}</td>
            </tr>
        </table>
        <br><br>
        <a class="btn btn-dark" href="/detail/${owner.id}/editOwner">Edit Owner</a> &nbsp;&nbsp; <a class="btn btn-dark"
                                                                                                    href="/detail/${owner.id}/addPet">Add
        New Pet</a>
        <br><br>
        <h3>Pets and Visits:</h3>
        <br>
        <table class="table table-striped">
            <c:forEach items="${owner.getPets()}" var="pet">
                <tr>
                    <td>
                        <table>
                            <tr>
                                <th>
                            <tr>
                                <th>Name:</th>
                                <td>${pet.getName()}</td>
                            </tr>
                            </th>
                            </tr>
                            <tr>
                                <th>
                            <tr>
                                <th>Birth Date:</th>
                                <td>${pet.getDateOfBirth().toString().substring(0, 10)} ${pet.getDateOfBirth().toString().substring(24, 28)}</td>
                            </tr>
                            </th>
                            </tr>
                            <tr>
                                <th>
                            <tr>
                                <th>Type:</th>
                                <td>${pet.getPetType()}</td>
                            </tr>
                            </th>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr>
                                <th>Visit Date</th>
                                <th>&nbsp;&nbsp;Description</th>
                            </tr>
                            <c:forEach items="${pet.getVisits()}" var="visit">
                                <tr>
                                    <td>${visit.getDate().toString().substring(0, 10)} ${visit.getDate().toString().substring(24, 28)}</td>
                                    <td>&nbsp;&nbsp;${visit.getDescription()}</td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <th>&nbsp;</th>
                                <th>&nbsp;</th>
                            </tr>
                            <tr>
                                <th><a class="nav-link" href="/detail/${owner.getId()}/editPet/${pet.getId()}">Edit
                                    Pet</a></th>
                                <th><a class="nav-link" href="/detail/${owner.getId()}/addVisit/${pet.getId()}">Add
                                    Visit</a></th>
                            </tr>
                        </table>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</aside>