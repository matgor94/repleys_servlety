<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.05.2025
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Zadanie 3 - MVC</title>
</head>
<body>
<form action="/mvc13" method="post">
  Tytuł
  <label>
    <input type="text" name="title">
  </label><br>
  Autor
  <label>
    <input type="text" name="author">
  </label><br>
  ISBN
  <label>
    <input type="number" name="isbn">
  </label><br>
  <input type="submit" name="submit" value="Wyślij">
</form>
</body>
</html>
