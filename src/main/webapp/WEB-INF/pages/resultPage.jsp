<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<table border="2">
    <tr>
        <th>ID</th>
        <th>Вопрос</th>
        <th>Ответ</th>
        <th>Дата</th>
    </tr>
    <c:forEach items="${votes}" var="item">
        <tr>
            <td> ${item.id} </td>
            <td> ${item.question} </td>
            <td> ${item.answer} </td>
            <td> ${item.date} </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>