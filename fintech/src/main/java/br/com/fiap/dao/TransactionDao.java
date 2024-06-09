package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.models.Transaction;
import br.com.fiap.models.Account;

public class TransactionDao {
    private Connection connection;

    public TransactionDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Transaction transaction) {
        String sql = "INSERT INTO tb_transactions(id, acc_id, title, description, value, date_transaction) VALUES (trans_seq.NEXTVAL, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, transaction.getAccount().getId());
            ps.setString(2, transaction.getTitle());
            ps.setString(3, transaction.getDescription());
            ps.setBigDecimal(4, transaction.getValue());
            ps.setDate(5, java.sql.Date.valueOf(transaction.getDateTransaction()));
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Transaction> getAll() {
        String sql = "SELECT t.*, a.name, a.document_id, a.balance FROM tb_transactions t JOIN tb_accounts a ON t.acc_id = a.id ORDER BY t.id";
        List<Transaction> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account(
                    rs.getInt("acc_id"),
                    rs.getString("name"),
                    rs.getString("document_id"),
                    rs.getBigDecimal("balance")
                );
                Transaction transaction = new Transaction(
                    rs.getInt("id"),
                    account,
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getBigDecimal("value"),
                    rs.getDate("date_transaction").toLocalDate()
                );
                list.add(transaction);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void update(Transaction transaction) {
        String sql = "UPDATE tb_transactions SET acc_id = ?, title = ?, description = ?, value = ?, date_transaction = ? WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, transaction.getAccount().getId());
            ps.setString(2, transaction.getTitle());
            ps.setString(3, transaction.getDescription());
            ps.setBigDecimal(4, transaction.getValue());
            ps.setDate(5, java.sql.Date.valueOf(transaction.getDateTransaction()));
            ps.setInt(6, transaction.getId());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int transactionId) {
        String sql = "DELETE FROM tb_transactions WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, transactionId);
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
