<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Procesando Login</title>
</head>
<body>
    <h2>Procesando Login</h2>
    
    <%-- Recuperar los parámetros enviados --%>
    <% String modo = request.getParameter("modo"); %>
    <% String id = request.getParameter(modo.equals("docente") ? "idDocente" : "idAdmin"); %>
    <% String contrasena = request.getParameter("contrasena"); %>
    
    <%-- Aquí puedes añadir la lógica para autenticar y redirigir según el modo --%>
    
</body>
</html>
