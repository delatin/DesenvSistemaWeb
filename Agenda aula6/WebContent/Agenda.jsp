<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="model.Agenda" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Visualizar Agenda</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <%Agenda agenda=(Agenda)request.getAttribute( "agenda"); %>
        <!-- Barra superior com os menus de navegação -->

        <!-- Container Principal -->
        <div id="main" class="container">
            <h3 class="page-header">Visualizar Agenda #<%=agenda.getId() %></h3>
            <div class="row">
                <div class="col-md-12">
                    <p><strong>Nome</strong>
                    </p>
                    <p>
                        <%=agenda.getNome() %>
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p><strong>Email</strong>
                    </p>
                    <p>
                        <%=agenda.getEmail() %>
                    </p>
                </div>
                <div class="col-md-6">
                    <p><strong>Telefone</strong>
                    </p>
                    <p>
                        <%=agenda.getTelefone() %>
                    </p>
                </div>
                    <div class="col-md-6">
                    <p><strong>Endereco</strong>
                    </p>
                    <p>
                        <%=agenda.getEndereco() %>
                    </p>
                </div>
            </div>
            <hr />
            <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="index.html" class="btn btn-default">Voltar</a>
                </div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>

</html>