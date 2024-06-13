<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Fitnech</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="<%= request.getContextPath() %>/Pages/style.css">
</head>

<body>
  <header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        <img class="icon" src="<%= request.getContextPath() %>/assets/Logo-Fintech.jpg" alt="icone da empresa Fintech">
        <div class="nav-login" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#home">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#cards">Informa��es</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#footer">Sobre n�s</a>
            </li>
          </ul>
          <a class="btn btn-outline-success" type="submit" href="<%= request.getContextPath() %>/Pages/cadastro.jsp">Cadastro</a>
        </div>
      </div>
    </nav>
  </header>
  <section id="home">
    <div class="container home-section">
      <div class="row">
        <div class="col-md-6">
          <h1>Seja bem-vindo a Fintech</h1>
          <p>Fintech: Transformando a Maneira Como Voc� Garante Seu Futuro Financeiro
            <br>
            Bem-vindos � Fintech, onde inova��o e seguran�a se encontram para revolucionar suas finan�as. Nossa miss�o � simplificar a gest�o financeira, tornando-a acess�vel e eficiente para todos.
            <br>
            Na Fintech, oferecemos solu��es financeiras de ponta, desde contas digitais sem tarifas at� investimentos automatizados com intelig�ncia artificial. Nosso aplicativo intuitivo permite que voc� acompanhe seus gastos, poupe de forma inteligente e invista com confian�a, tudo na palma da sua m�o.</p>
        </div>
      </div>
    </div>
  </section>

  <section class="cardColor card-cards">
    <div class="section-cards" id="cards">
      <div class="row row-cols-1 row-cols-md-2 g-4 card-section">
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/finance.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Simplifique suas Finan�as</h5>
              <p class="card-text">Na Fintech, oferecemos uma experi�ncia financeira descomplicada. Com nosso aplicativo intuitivo, voc� gerencia seus gastos, faz transfer�ncias e controla seus investimentos de forma simples e r�pida. Experimente a praticidade de ter todas as suas finan�as em um s� lugar.</p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/firstplace.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Seguran�a em Primeiro Lugar</h5>
              <p class="card-text">Sua seguran�a � nossa prioridade. Utilizamos tecnologia de ponta para proteger seus dados e garantir transa��es seguras. Na Fintech, voc� pode confiar que suas informa��es est�o sempre protegidas, permitindo que voc� foque no que realmente importa: seu futuro financeiro.</p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/inteligente.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Investimentos Inteligentes</h5>
              <p class="card-text">Maximize seus ganhos com os investimentos automatizados da Fintech. Nossa intelig�ncia artificial analisa o mercado e oferece as melhores op��es para o seu perfil, ajudando voc� a alcan�ar seus objetivos financeiros com efici�ncia e seguran�a.</p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/sup.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Suporte 24/7
              </h5>
              <p class="card-text">Na Fintech, estamos sempre ao seu lado. Nosso suporte ao cliente est� dispon�vel 24 horas por dia, 7 dias por semana, para responder suas d�vidas e ajudar voc� a tirar o m�ximo proveito dos nossos servi�os. Conte conosco para uma experi�ncia financeira tranquila e confi�vel.</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
    
  <footer class="bg-dark text-white mt-5" id="footer">
    <div class="container py-5">
      <div class="row">
        <div class="col-md-4 mb-4">
          <h5>Sobre N�s</h5>
          <p>A Fintech est� comprometida em transformar a gest�o financeira pessoal, oferecendo solu��es inovadoras e seguras. Nosso objetivo � simplificar sua vida financeira com tecnologia de ponta e um suporte excepcional. Junte-se a n�s e descubra como � f�cil ter controle total sobre seu futuro financeiro.</p>
        </div>
        <div class="col-md-4 mb-4">
          <h5>Links �teis</h5>
          <ul class="list-unstyled">
            <li><a href="#home" class="text-white text-decoration-none">Home</a></li>
            <li><a href="#cards" class="text-white text-decoration-none">Informa��es</a></li>
            <li><a href="#footer" class="text-white text-decoration-none">Sobre n�s</a></li>
          </ul>
        </div>
        <div class="col-md-4 mb-4">
          <h5>Contato</h5>
          <p>Endere�o: xxxxxxxxx</p>
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
