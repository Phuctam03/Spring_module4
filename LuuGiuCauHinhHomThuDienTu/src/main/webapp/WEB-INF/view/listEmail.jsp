<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/8/2023
  Time: 1:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form"	uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>list email</title>
</head>
<body>
<h1>List Email</h1>
<table>
    <tr>
<%--        <th>ID</th>--%>
        <th>Languages</th>
        <th>Page Size</th>
        <th>Spams filter</th>
        <th>Signature</th>
        <th>update</th>
    </tr>
    <c:forEach var="email" items="${emails}">
        <td><input type="hidden" value="${email.id}"></td>
        <tr>
            <td>${email.languages}</td>
            <td>${email.pageSize}</td>
            <td>
               <c:if test="${email.spamFilter == true}">
                    Yes
               </c:if>
                <c:if test="${email.spamFilter == false}">
                    No
                </c:if>
            </td>
            <td>${email.signature}</td>
            <td>
                <a href="/update?id=${email.id}">Update</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
