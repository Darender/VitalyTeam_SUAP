<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesión</title>
</head>
<body style="background-color: #FFDAB9;">
    <h2>Iniciar Sesión</h2>
    
    <%-- Obtener el modo desde el parámetro enviado --%>
    <% String modo = request.getParameter("modo"); %>
    
    <%-- Formulario para el modo docente --%>
    <% if ("docente".equals(modo)) { %>
        <form action="procesarLogin.jsp" method="post">
            <input type="hidden" name="modo" value="docente" />
            <label for="idDocente">ID Docente:</label>
            <input type="text" id="idDocente" name="idDocente" pattern="[0-9]*" required/>
            <br/>
            <input type="submit" value="Ingresar"/>
        </form>
    <% } %>
    
    <%-- Formulario para el modo administrador --%>
    <% if ("administrador".equals(modo)) { %>
        <form action="procesarLogin.jsp" method="post">
            <input type="hidden" name="modo" value="administrador" />
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
