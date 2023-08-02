<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/2/2023
  Time: 11:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formconvert</title>
</head>
<body>
<h1>CONVERT USD TO VND</h1>
<form method="post" action="/convertmoney">
    <table>
        <tr>
            <th>input money </th>
            <td><input type="text" name="moneyUSD" ></td>
            <td><input type="submit" value="Convert"></td>
        </tr>
    </table>
</form>
</body>
</html>
