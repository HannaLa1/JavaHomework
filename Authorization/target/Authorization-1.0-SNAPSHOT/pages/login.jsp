<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 06.10.2021
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1 align="center">Authorization Page:</h1>

    <a href="<c:url value="/"/>">BACK</a><br>

    <form action="<c:url value="/login"/>" method="post">
        <table style="background-color: pink; margin-left: 500px; margin-top: 50px">
            <tr>
                <td>
                    <h3 style="color: palevioletred;">${requestScope.message}</h3>
                    <h3 style="color: palevioletred;">${requestScope.successMessage}</h3>
                </td>
                <td></td>
            </tr>

            <tr>
                <td>
                    <h3 style="color: palevioletred;">LOGIN...</h3>
                </td>
                <td></td>
            </tr>

            <tr>
                <td>Login: </td>
                <td><input type="text" pattern="^[a-z](\.?\w)*@[a-z]+(\.[a-z]+)+" name="login" required></td>
            </tr>

            <tr>
                <td>Password: </td>
                <td><input type="password" name="password1" required></td>
            </tr>

            <tr>
                <td><input type="submit" name="submit" value="logIn"></td>
                <td><input type="submit" name="submit" value="registration"></td>
            </tr>
        </table>
    </form>
</body>
</html>
