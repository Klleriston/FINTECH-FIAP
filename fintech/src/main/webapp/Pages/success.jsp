<%@ page import="br.com.fiap.dao.AccountDao" %>
<%@ page import="br.com.fiap.models.Account" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Account account = null;
    try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm552849", "050303")) {
        AccountDao accountDao = new AccountDao(connection);
        account = accountDao.getById(id);
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro Bem-sucedido - Fintech</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container mt-5">
        <h2>Cadastro Bem-sucedido</h2>
        <%
            if (account != null) {
        %>
        <p>Obrigado por se cadastrar! Seus dados são:</p>
        <ul>
            <li>ID: <%= account.getId() %></li>
            <li>Nome: <%= account.getName() %></li>
            <li>Documento: <%= account.getDocument_id() %></li>
            <li>Saldo: <%= account.getBalance() %></li>
        </ul>
        <%
            } else {
        %>
        <p>Erro ao recuperar os dados do cliente.</p>
        <%
            }
        %>
        <a href="<%= request.getContextPath() %>/index.jsp" class="btn btn-primary">Voltar para Home</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
