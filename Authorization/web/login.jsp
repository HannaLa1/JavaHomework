<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 06.10.2021
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1 align="center">Authorization Page:</h1>
    <form action="LoginServlet" method="post">
        <table style="background-color: pink; margin-left: 500px; margin-top: 50px">
            <tr>
                <td>
                    <h3 style="color: palevioletred;">${message}</h3>
                    <h3 style="color: palevioletred;">${successMessage}</h3>
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
                <td>UserId: </td>
                <td><input type="text" pattern="^[a-z](\.?\w)*@[a-z]+(\.[a-z]+)+" name="userId" required></td>
            </tr>

            <tr>
                <td>Password: </td>
                <td><input type="password" name="password1"></td>
            </tr>

            <tr>
                <td><input type="submit" name="submit" value="logIn"></td>
                <td><input type="submit" name="submit" value="registration"></td>
            </tr>
        </table>
    </form>
</body>
</html>
