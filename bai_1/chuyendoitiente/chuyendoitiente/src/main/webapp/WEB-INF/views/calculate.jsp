<%--
  Created by IntelliJ IDEA.
  User: DUC HIEN
  Date: 7/3/2023
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Calculate</title>
</head>
<body>
<h1>Calculate</h1>
<form action="/calculate" method="post">
    <input type="number" name="dong" id="dong" placeholder="Nhap so tien (vnd): ">
    <button>Calculate</button>
</form>

<p><c:out value="${usd}"></c:out></p>


</body>
</html>
