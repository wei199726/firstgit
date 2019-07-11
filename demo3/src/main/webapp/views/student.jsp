<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2019/7/3
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <th>
        <td>
            学号：
        </td>
        <td>
            姓名：
        </td>
        <td>
            年龄：
        </td>
        <td>
            操作：
        </td>
    </th>
    <c:forEach items="${content}" var="Student">
        <tr>
            <td>
                ${Student.id}
            </td>
            <td>
                    ${Student.stuName}
            </td>
            <td>
                    ${Student.stuAge}
            </td>
            <td>
                    <a href="">修改</a>
                    <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>
</body>
</html>
