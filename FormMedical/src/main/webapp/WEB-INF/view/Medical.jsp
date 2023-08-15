<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/6/2023
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Medical</title>
</head>
<body>
<a href="/createMedical">ADD new form medical</a>
<table border="1">
     <tr>
         <th>ID</th>
         <th>Name</th>
         <th>Năm Sinh</th>
         <th>Giới tính</th>
         <th>Quốc tịch</th>
         <th>Chứng minh nhân dân hoặc hộ chiếu</th>
         <th>Thông tin đi lại</th>
         <th>Số hiệu phương tiện</th>
         <th>Số ghế</th>
         <th>Ngày Khởi Hành</th>
         <th>Ngày Kết thúc</th>
         <th>Thông tin thêm</th>
         <th>Địa chỉ liên lạc</th>
         <th>Địa chỉ nơi ở</th>
         <th>Điện thoại</th>
         <th>Email</th>
         <th>Triệu Chứng</th>
         <th>Cập nhật</th>
     </tr>
    <c:forEach items="${medicals}" var="m">
        <tr>
            <td><input type="hidden" value="${m.id}"></td>
            <td>${m.name}</td>
            <td>${m.yearBirthday}</td>
            <td>${m.gender}</td>
            <td>${m.nationality}</td>
            <td>${m.identity_card}</td>
            <td>${m.travel_info}</td>
            <td>${m.vehicle_number}</td>
            <td>${m.chair_number}</td>
            <td>${m.start_depart}</td>
            <td>${m.end_depart}</td>
            <td>${m.more_info}</td>
            <td>${m.contact_address_first}</td>
            <td>${m.live_address}</td>
            <td>${m.phone}</td>
            <td>${m.email}</td>
            <td>
                <c:forEach items="${m.sysmptom}" var="s">
                    <c:if test="${s.choose == true}">
                         ${s.name}
                    </c:if>
                </c:forEach>
            </td>
            <td>
                <a href="/updateMedical?id=${m.id}">Cập nhật</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
