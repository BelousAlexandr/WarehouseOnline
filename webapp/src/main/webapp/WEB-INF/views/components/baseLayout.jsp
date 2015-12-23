<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <title><tiles:insertAttribute name="title"/></title>
</head>
<body>
    <div>
        <tiles:insertAttribute name="header" />
    </div>
    <div>
        <tiles:insertAttribute name="body" />
    </div>
    <div>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
