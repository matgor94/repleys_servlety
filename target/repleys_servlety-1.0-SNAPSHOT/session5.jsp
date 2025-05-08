<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.05.2025
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session 5</title>
</head>
<body>
<form action="/session5" method="post">
    Imię:
    <input type="text" name="imie">
    Nazwisko:
    <input type="text" name="nazwisko">
    Email:
    <input type="text" name="mail">

    Wpisz poniżej sumę liczb ${first} i ${second}
    <input type="number" name="captcha">
    <button type="submit">Zatwierdź</button>
</form>
</body>
</html>
