<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%--@ taglib prefix="wj" uri="http://www.webjars.org/tags"--%>
<html>
    <head>
        <link href="<s:url value='/webjars/bootstrap/3.3.2/css/bootstrap.css' />" rel="stylesheet">
       <%-- <wj:locate path="bootstrap.css" var="boot-css"/>
        <link href="<s:url value='/webjars${boot-css}' />" rel="stylesheet">--%>
    </head>
    <body>
        <h1>${msg}</h1>

        <%--<wj:locate path="bootstrap.js" var="boot-js"/>
        <wj:locate path="jquery.js" var="jquery-js"/>
        <script src="<s:url value='/webjars${boot-js}' />"></script>
        <script src="<s:url value='/webjars${jquery-js}' />"></script>--%>
     <script src="<s:url value='/webjars/jquery/2.1.3/jquery.js' />"></script>
        <script src="<s:url value='/webjars/bootstrap/3.3.2/js/bootstrap.js' />"></script>
    </body>
</html>