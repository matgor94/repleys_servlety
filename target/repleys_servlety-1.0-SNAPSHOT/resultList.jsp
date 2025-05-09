<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.05.2025
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Zadanie 4 - MVC</title>
</head>
<body>
<c:forEach items="${bookList}" var="book">
  ${book.title} ${book.author} ${book.isbn}
</c:forEach>
</body>
</html>
