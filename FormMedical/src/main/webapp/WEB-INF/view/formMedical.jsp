<%--
  Created by IntelliJ IDEA.
  User: HPT AcerNTR07
  Date: 8/6/2023
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>form medical</title>
    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }

        body {
            margin: 0 auto;
            font-family: Arial;
            font-size: 15px;
        }

        .container {
            /*display: flex;*/
            /*flex-direction: column; !* Xếp các phần tử dọc theo cột *!*/
            /*justify-content: center; !* Căn giữa theo chiều dọc *!*/
            /*align-items: center; !* Căn giữa theo chiều ngang *!*/
            /*height: 100vh;*/
        }

        th {
            text-align: left;
        }

    </style>
</head>
<body>
<div class="container">
    <form:form action="/medical" method="post" modelAttribute="medical">
        <div class="content1">
            <table>
                <tr>
                    <th>ID</th>
                </tr>
                <tr>
                    <td>
                        <c:choose>
                            <c:when test="${action == 'create'}">
                                <form:input path="id"/>
                            </c:when>
                            <c:otherwise>
                                <form:hidden path="id"/>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>

                <tr>
                    <th>Họ tên(ghi chữ IN HOA)</th>
                </tr>
                <tr>
                    <td><form:input path="name"/></td>
                </tr>

                <tr>
                    <th>Năm Sinh</th>
                </tr>
                <tr>
                    <td>
                        <form:select path="yearBirthday" items="${yearArrays}"/>
                    </td>
                </tr>
                <tr>
                    <th>Giới Tính</th>
                </tr>
                <tr>
                    <td><form:select path="gender" items="${genderArrays}"/></td>
                </tr>
                <tr>
                    <th>Quốc Tịch</th>
                </tr>
                <tr>
                    <td><form:select path="nationality" items="${nationalityArrays}"/></td>
                </tr>
                <tr>
                    <th>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</th>
                </tr>
                <tr>
                    <td><form:input path="identityCard"/></td>
                </tr>
                <tr>
                    <th>Thông tin đi lại</th>
                </tr>
                <tr>
                    <td><form:radiobuttons path="travelInfo" items="${travelArrays}"/></td>
                </tr>
                <tr>
                    <th>Số hiệu Phương tiện</th>
                </tr>
                <tr>
                    <td><form:input path="vehicleNumber"/></td>
                </tr>
                <tr>
                    <th>Số Ghế</th>
                </tr>
                <tr>
                    <td><form:input path="chairNumber"/></td>
                </tr>
                <tr>
                    <th>Ngày Khởi hành</th>
                </tr>
                <tr>
                    <td><form:input path="startDepart"/></td>
                </tr>
                <tr>
                    <th>Ngày Kết thúc</th>
                </tr>
                <tr>
                    <td><form:input path="endDepart"/></td>
                </tr>
                <tr>
                    <th>Thông Tin thêm</th>
                </tr>
                <tr>
                    <th><form:input path="moreInfo"/></th>
                </tr>
                <tr>
                    <th>Địa chỉ liên lạc</th>
                </tr>
                <tr>
                    <td><form:input path="contactAddressFirst"/></td>
                </tr>
                <tr>
                    <th>Địa chỉ nơi ở</th>
                </tr>
                <tr>
                    <td><form:input path="liveAddress"/></td>
                </tr>
                <tr>
                    <th>Số điện thoại</th>
                </tr>
                <tr>
                    <td><form:input path="phone"/></td>
                </tr>
                <tr>
                    <th>Email</th>
                </tr>
                <tr>
                    <td><form:input path="email"/></td>
                </tr>
            </table>
        </div>
        <div class="content2">
            <table border="1">
                <tr>
                    <td>Triệu Chứng</td>
                    <td>Có</td>
                    <td>Không</td>
                </tr>
                <c:forEach items="${medical.sysmptom}" var="s" varStatus="row">
                    <tr>
                        <td>${s.name} </td>
                        <form:hidden path="sysmptom[${row.index}].name" value="${s.name}" />
                        <td><form:radiobutton path="sysmptom[${row.index}].choose" value="true"/></td>
                        <td><form:radiobutton path="sysmptom[${row.index}].choose" value="false"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <form:button>Gửi tờ khai</form:button>
        <input type="hidden" name="action" value="${action}">
    </form:form>
</div>
</body>
</html>
