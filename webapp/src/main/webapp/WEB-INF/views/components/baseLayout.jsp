<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <title><tiles:insertAttribute name="title"/></title>
    <link href="/resources/css/sticky-footer-page.css" rel="stylesheet">
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div id="wrap">
        <div>
            <tiles:insertAttribute name="header" />
        </div>
        <div id="container">
            <tiles:insertAttribute name="body" />
        </div>
    </div>
    <div id="footer">
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
