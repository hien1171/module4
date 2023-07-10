<%--
  Created by IntelliJ IDEA.
  User: DUC HIEN
  Date: 7/5/2023
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary" method="post">
    <input type="text" name="tiengViet" id="tiengViet" placeholder="Nhap tu: ">
    <button>Translate</button>
</form>

<p><c:out value="${el}"></c:out></p>
</body>
</html>
