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

import br.com.fiap.dao.TransactionDao;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.dao.DAO;
import br.com.fiap.models.Transaction;
import br.com.fiap.models.Account;

@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
    private TransactionDao transactionDao;
    private AccountDao accountDao;
    private Connection connection;

    @Override
    public void init() {
        connection = DAO.connect();
        transactionDao = new TransactionDao(connection);
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
                    //insertTransaction(request, response);
                    break;
                case "delete":
                    //deleteTransaction(request, response);
                    break;
                case "edit":
                    //showEditForm(request, response);
                    break;
                case "update":
                    //updateTransaction(request, response);
                    break;
                default:
                    //listTransaction(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listTransaction(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<Transaction> listTransaction = transactionDao.getAll();
        request.setAttribute("listTransaction", listTransaction);
        request.getRequestDispatcher("/transaction/list.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Account> listAccount = accountDao.getAll();
        request.setAttribute("listAccount", listAccount);
        request.getRequestDispatcher("/transaction/form.jsp").forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Transaction existingTransaction = transactionDao.getById(id);
        List<Account> listAccount = accountDao.getAll();
        request.setAttribute("transaction", existingTransaction);
        request.setAttribute("listAccount", listAccount);
        request.getRequestDispatcher("/transaction/form.jsp").forward(request, response);
    }

    private void insertTransaction(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int accountId = Integer.parseInt(request.getParameter("accountId"));
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        BigDecimal value = new BigDecimal(request.getParameter("value"));
        java.sql.Date dateTransaction = java.sql.Date.valueOf(request.getParameter("dateTransaction"));
        Account account = accountDao.getById(accountId);
        Transaction newTransaction = new Transaction(account, title, description, value, dateTransaction.toLocalDate());
        transactionDao.insert(newTransaction);
        response.sendRedirect("transaction?action=list");
    }

    private void updateTransaction(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int accountId = Integer.parseInt(request.getParameter("accountId"));
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        BigDecimal value = new BigDecimal(request.getParameter("value"));
        java.sql.Date dateTransaction = java.sql.Date.valueOf(request.getParameter("dateTransaction"));
        Account account = accountDao.getById(accountId);
        Transaction transaction = new Transaction(id, account, title, description, value, dateTransaction.toLocalDate());
        transactionDao.update(transaction);
        response.sendRedirect("transaction?action=list");
    }

    private void deleteTransaction(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        transactionDao.delete(id);
        response.sendRedirect("transaction?action=list");
    }
}
