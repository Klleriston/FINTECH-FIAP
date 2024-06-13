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
              <a class="nav-link" href="#cards">Informações</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#footer">Sobre nós</a>
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
          <p>Fintech: Transformando a Maneira Como Você Garante Seu Futuro Financeiro
            <br>
            Bem-vindos à Fintech, onde inovação e segurança se encontram para revolucionar suas finanças. Nossa missão é simplificar a gestão financeira, tornando-a acessível e eficiente para todos.
            <br>
            Na Fintech, oferecemos soluções financeiras de ponta, desde contas digitais sem tarifas até investimentos automatizados com inteligência artificial. Nosso aplicativo intuitivo permite que você acompanhe seus gastos, poupe de forma inteligente e invista com confiança, tudo na palma da sua mão.</p>
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
              <h5 class="card-title">Simplifique suas Finanças</h5>
              <p class="card-text">Na Fintech, oferecemos uma experiência financeira descomplicada. Com nosso aplicativo intuitivo, você gerencia seus gastos, faz transferências e controla seus investimentos de forma simples e rápida. Experimente a praticidade de ter todas as suas finanças em um só lugar.</p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/firstplace.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Segurança em Primeiro Lugar</h5>
              <p class="card-text">Sua segurança é nossa prioridade. Utilizamos tecnologia de ponta para proteger seus dados e garantir transações seguras. Na Fintech, você pode confiar que suas informações estão sempre protegidas, permitindo que você foque no que realmente importa: seu futuro financeiro.</p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/inteligente.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Investimentos Inteligentes</h5>
              <p class="card-text">Maximize seus ganhos com os investimentos automatizados da Fintech. Nossa inteligência artificial analisa o mercado e oferece as melhores opções para o seu perfil, ajudando você a alcançar seus objetivos financeiros com eficiência e segurança.</p>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img src="<%= request.getContextPath() %>/assets/sup.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title">Suporte 24/7
              </h5>
              <p class="card-text">Na Fintech, estamos sempre ao seu lado. Nosso suporte ao cliente está disponível 24 horas por dia, 7 dias por semana, para responder suas dúvidas e ajudar você a tirar o máximo proveito dos nossos serviços. Conte conosco para uma experiência financeira tranquila e confiável.</p>
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
          <h5>Sobre Nós</h5>
          <p>A Fintech está comprometida em transformar a gestão financeira pessoal, oferecendo soluções inovadoras e seguras. Nosso objetivo é simplificar sua vida financeira com tecnologia de ponta e um suporte excepcional. Junte-se a nós e descubra como é fácil ter controle total sobre seu futuro financeiro.</p>
        </div>
        <div class="col-md-4 mb-4">
          <h5>Links Úteis</h5>
          <ul class="list-unstyled">
            <li><a href="#home" class="text-white text-decoration-none">Home</a></li>
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
