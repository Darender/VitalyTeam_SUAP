<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    
    <%-- Obtener el modo desde el parámetro enviado --%>
    <% String modo = request.getParameter("modo"); %>
    
    <%-- Formulario para el modo docente --%>
    <% if ("docente".equals(modo)) { %>
        <form action="procesarLogin.jsp" method="post">
            <label for="idDocente">ID Docente:</label>
            <input type="text" id="idDocente" name="idDocente" pattern="[0-9]*" required/>
            <br/>
            <input type="submit" value="Ingresar"/>
        </form>
    <% } %>
    
    <%-- Formulario para el modo administrador --%>
    <% if ("administrador".equals(modo)) { %>
        <form action="procesarLogin.jsp" method="post">
            <label for="idAdmin">ID Administrador:</label>
            <input type="text" id="idAdmin" name="idAdmin" pattern="[0-9]*" required/>
            <br/>
            <label for="contrasena">Contraseña:</label>
            <input type="password" id="contrasena" name="contrasena" required/>
            <br/>
            <input type="submit" value="Ingresar"/>
        </form>
    <% } %>
</body>
</html>

