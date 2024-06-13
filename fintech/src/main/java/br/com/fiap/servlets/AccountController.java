package br.com.fiap.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fiap.dao.DAO;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.models.Account;

public class AccountController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String documentId = request.getParameter("document_id");
        String saldo = request.getParameter("saldo");
        String senha = request.getParameter("senha");
        String confirmarSenha = request.getParameter("confirmarSenha");

        BigDecimal saldoInicial = new BigDecimal(saldo);

        if (senha.equals(confirmarSenha)) {
            Account account = new Account(nome, documentId, saldoInicial);

            try (Connection connection = DAO.connect()) {
                if (connection != null) {
                    AccountDao accountDao = new AccountDao(connection);
                    accountDao.insert(account);
                    response.sendRedirect(request.getContextPath() + "/Pages/success.jsp?id=" + account.getId());
                } else {
                    response.sendRedirect(request.getContextPath() + "/Pages/cadastro.jsp?error=Erro ao conectar ao banco de dados");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.sendRedirect(request.getContextPath() + "/Pages/cadastro.jsp?error=Erro ao cadastrar o usuário");
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/Pages/cadastro.jsp?error=Senhas não coincidem");
        }
    }
}
