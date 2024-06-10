package br.com.fiap.servlets;

import java.sql.SQLException;
import java.util.List;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.dao.AccountDao;
import br.com.fiap.dao.DAO;
import br.com.fiap.models.Account;

@WebServlet("/account")
public class AccountController extends HttpServlet {
    private AccountDao accountDao;
    private Connection connection;

    @Override
    public void init() {
        connection = DAO.connect();
        accountDao = new AccountDao(connection);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "list"; 
        try {
            switch (action) {
                case "new":
                    //showNewForm(request, response);
                    break;
                case "insert":
                    //insertAccount(request, response);
                    break;
                case "delete":
                    //deleteAccount(request, response);
                    break;
                case "edit":
                    //showEditForm(request, response);
                    break;
                case "update":
                    //updateAccount(request, response);
                    break;
                default:
                    //listAccount(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<Account> listAccount = accountDao.getAll();
        request.setAttribute("listAccount", listAccount);
        request.getRequestDispatcher("/account/list.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/account/form.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Account existingAccount = accountDao.getById(id);
        request.setAttribute("account", existingAccount);
        request.getRequestDispatcher("/account/form.jsp").forward(request, response);
    }

    private void insertAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        String documentId = request.getParameter("document_id");
        BigDecimal balance = new BigDecimal(request.getParameter("balance"));
        Account newAccount = new Account(1, name, documentId, balance);
        accountDao.insert(newAccount);
        response.sendRedirect("account?action=list");
    }

    private void updateAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String documentId = request.getParameter("document_id");
        BigDecimal balance = new BigDecimal(request.getParameter("balance"));
        Account account = new Account(name, documentId, balance);
        accountDao.update(account);
        response.sendRedirect("account?action=list");
    }

    private void deleteAccount(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        accountDao.delete(id);
        response.sendRedirect("account?action=list");
    }
}
