<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/3/2023
  Time: 12:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dictionary</title>
</head>
<body>
<h1>Lookup dictionary</h1>
<form method="post" action="/Lookup">
    <table>
        <tr>
            <th>Word:</th>
            <td><input type="text" name="word" placeholder="englishWord"></td>
            <td>
                <input type="submit" value="LookUp">
            </td>
        </tr>
        <tr>
            <th>English is</th>
            <td>${word1} : ${result}</td>
        </tr>
    </table>
</form>


</body>
</html>
