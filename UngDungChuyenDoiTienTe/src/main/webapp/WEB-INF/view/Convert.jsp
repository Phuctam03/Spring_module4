<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/2/2023
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>convert</title>
</head>
<body>
<p>Convert to VND</p>
<fmt:formatNumber value="${convert}" pattern="#,### đ"/>
</body>
</html>
