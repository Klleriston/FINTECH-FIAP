<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cadastro - Fintech</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="<%= request.getContextPath() %>/home/style.css">
</head>

<body>
  <header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        <img class="icon" src="<%= request.getContextPath() %>/assets/Logo-Fintech.jpg" alt="icone da empresa tecsidel">
        <div class="nav-login" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="<%= request.getContextPath() %>/index.jsp">Home</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </header>

  <div class="container mt-5">
    <h2>Cadastro</h2>
    <form action="<%= request.getContextPath() %>/servlet/AccountController" method="post">
      <div class="mb-3">
        <label for="nome" class="form-label">Nome</label>
        <input type="text" class="form-control" id="nome" name="nome" required>
      </div>
      <div class="mb-3">
        <label for="document_id" class="form-label">Documento (CPF/CNPJ)</label>
        <input type="text" class="form-control" id="document_id" name="document_id" required>
      </div>
      <div class="mb-3">
        <label for="saldo" class="form-label">Saldo Inicial</label>
        <input type="number" step="0.01" class="form-control" id="saldo" name="saldo" required>
      </div>
      <div class="mb-3">
        <label for="senha" class="form-label">Senha</label>
        <input type="password" class="form-control" id="senha" name="senha" required>
      </div>
      <div class="mb-3">
        <label for="confirmarSenha" class="form-label">Confirmar Senha</label>
        <input type="password" class="form-control" id="confirmarSenha" name="confirmarSenha" required>
      </div>
      <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
  </div>

  <footer class="bg-dark text-white mt-5" id="footer">
    <div class="container py-5">
      <div class="row">
        <div class="col-md-4 mb-4">
          <h5>Sobre Nós</h5>
          <p>A Fintech está comprometida em transformar a gestão financeira pessoal, oferecendo soluções inovadoras e seguras. Nosso objetivo é simplificar sua vida financeira com tecnologia de ponta e um suporte excepcional. Junte-se a nós e descubra como é fácil ter controle total sobre seu futuro financeiro.</p>
        </div>
        <div class="col-md-4 mb-4">
          <h5>Links Úteis</h5>
          <ul class="list-unstyled">
            <li><a href="<%= request.getContextPath() %>/index.jsp" class="text-white text-decoration-none">Home</a></li>
            <li><a href="#cards" class="text-white text-decoration-none">Informações</a></li>
            <li><a href="#footer" class="text-white text-decoration-none">Sobre nós</a></li>
          </ul>
        </div>
        <div class="col-md-4 mb-4">
          <h5>Contato</h5>
          <p>Endereço: xxxxxxxxx</p>
          <p>Telefone: (00) 00 000 00 00</p>
          <p>Email: contato@fintech.com</p>
        </div>
      </div>
    </div>
    <div class="bg-secondary text-center py-3">
      <p class="mb-0">&copy; 2024 Fintech. Todos os direitos reservados.</p>
    </div>
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
