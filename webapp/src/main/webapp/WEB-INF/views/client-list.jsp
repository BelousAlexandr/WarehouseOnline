<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div>

    <form name="clientList" id="clientList" method="post" action="#">
        <div class="btn-group">
            <button type="submit" class="btn btn-primary">Create client</button>
            <button type="submit"  form="clientList" name="submit-button" value="delete" class="btn btn-primary">Deactivate cient</button>
        </div>

        <c:choose>
            <c:when test="${not empty requestScope.clients}">
                <jsp:include page="client-table.jsp" />
            </c:when>
            <c:otherwise>
                <div class="well infoblock">You have no clients. <a href="#">Add</a> new client.</div>
            </c:otherwise>
        </c:choose>
    </form>

</div>

</body>
</html>
