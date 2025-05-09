<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.05.2025
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Zadanie 3 - jsp</title>
</head>
<body>
${empty param.a or empty param.b ? "brak" : "a: ".concat(param.a).concat(" b: ").concat(param.b)}
</body>
</html>
