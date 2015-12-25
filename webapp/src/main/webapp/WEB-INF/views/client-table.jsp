<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<table class="table table-condensed">
    <thead>
    <tr>
        <th>
            <label><input type="checkbox" value=""></label>
        </th>
        <th>Company</th>
        <th>Date of registration</th>
        <th>State</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="client" items="${requestScope.clientList}">
        <tr>
            <td>
                <div class="checkbox">
                    <label><input type="checkbox" name="selectedContacts" value="${client.id}"></label>
                </div>
            </td>
            <td>
                <a href="client?id=${client.id}">${client.name}</a>
            </td>
            <td><fmt:formatDate pattern="dd.MM.yyyy"
                                value="${client.dateOfRegistration}" /></td>
            <td>${client.state}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
