<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.05.2025
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Praca domowa - dzien 4 - zadanie 1</title>
</head>
<body>
<p>${empty param.author ? "Brak parametru author" : "Wybrany autor to: ".concat(param.author)}</p>
</body>
</html>
