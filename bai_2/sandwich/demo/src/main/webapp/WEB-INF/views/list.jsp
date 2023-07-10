<%--
  Created by IntelliJ IDEA.
  User: DUC HIEN
  Date: 7/5/2023
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/list" method="post">
    <input type="checkbox" name="condiment" id="condiment1" value="Lettuce">
    <label for="condiment1">Lettuce</label><br>
    <input type="checkbox" name="condiment" id="condiment2" value="Tomato">
    <label for="condiment1">Tomato</label><br>
    <input type="checkbox" name="condiment" id="condiment3" value="Mustard">
    <label for="condiment1">Mustard</label><br>
    <input type="checkbox" name="condiment" id="condiment4" value="Sprouts">
    <label for="condiment1">Sprouts</label><br>
    <button>Save</button>
</form>

<table>
    <c:forEach var="condiment" items="${condiment}">
        <tr>
            <td><c:out value="${condiment}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
