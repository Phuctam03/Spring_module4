<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/6/2023
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>form email</title>
</head>
<body>
<form:form method="post" action="/update" modelAttribute="email">
    <table style="text-align: left" >
        <form:hidden path="id"/>
        <tr>
            <th>Languages</th>
           <td style="width: 150px"> <form:select path="languages" items="${languagesArrays}"/></td>
        </tr>
        <tr>
            <th>Page Size</th>
           <td> <span>Show</span> <form:select path="pageSize" items="${pageSizeArrays}"/><span>emails per page</span></td>
        </tr>
        <tr></tr>
        <tr>
            <th>Spams Filter</th>
            <td><form:checkbox path="spamFilter"/><span>Enable spams filter</span></td>
        </tr>
        <tr>
            <th>Signature</th>
            <td><form:textarea path="signature" rows="3" cols="4"/> </td>
        </tr>
        <tr>
            <td colspan="2">
                <form:button>Update</form:button>
            </td>
            <td colspan="2">
                <form:button><a href="/listemail">Cancel</a></form:button>
            </td>
        </tr>
    </table>
<%--    <input type="hidden" name="action" value="${action}">--%>
</form:form>

</body>
</html>
