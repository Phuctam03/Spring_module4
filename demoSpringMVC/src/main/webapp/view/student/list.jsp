<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/1/2023
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>list-students</title>
</head>
<body>
<h1>LIST_STUDENTS</h1>
<table border="1">
     <tr>
         <th>ID</th>
         <th>Name</th>
         <th>Age</th>
         <th>Address</th>
     </tr>
    <c:forEach items="${students}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.address}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
