<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.Agenda"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>
</head>
<body>

<%Agenda agenda = (Agenda)request.getAttribute("agenda"); %>

Id: <%=agenda.getId() %><br>
Nome: <%=agenda.getNome() %><br>
Email: <%=agenda.getEmail() %><br>
Telefone: <%=agenda.getTelefone() %><br>
Endereco: <%=agenda.getEndereco() %><br>
</body>
</html>