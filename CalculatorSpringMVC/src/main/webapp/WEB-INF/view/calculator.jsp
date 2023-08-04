<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/4/2023
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<form method="post" action="/cal">
<table>
    <tr>
        <td><input type="text" name="first"></td>
        <td><input type="text" name="second"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Addition(+)" name="calculator">
            <input type="submit" value="Subtraction(-)" name="calculator">
            <input type="submit" value="Multiplication(*)" name="calculator">
            <input type="submit" value="Division(/)" name="calculator">
        </td>
    </tr>
    <tr>
       <td>
           <c:if test="${second != 0}">
               Result ${calculator} is : ${calculate}
           </c:if>
           <c:if test="${second == 0}">
              <span style="color: red">${message}</span>
           </c:if>
       </td>
    </tr>
</table>
</form>
</body>
</html>
