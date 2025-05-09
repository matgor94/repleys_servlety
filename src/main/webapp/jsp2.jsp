<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Zadanie 2 - MVC</title>
</head>
<body>
<c:forEach begin="${start}" end="${end}" var="val">
  ${val}
</c:forEach>
</body>
</html>
