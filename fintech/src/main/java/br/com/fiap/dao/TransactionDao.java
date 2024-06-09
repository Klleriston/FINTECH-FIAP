package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.models.*;

public class TransactionDao {
    private Connection connection;

    public TransactionDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Transaction transaction) {
        String sql = "INSERT INTO tb_transactions(acc_id, title, description, value, date_transaction) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, transaction.getAccount().getId());
            ps.setString(2, transaction.getTitle());
            ps.setString(3, transaction.getDescription());
            ps.setInt(4, transaction.getValue());
            ps.setDate(5, java.sql.Date.valueOf(transaction.getDateTransaction()));
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Transaction> getAll() {
        String sql = "SELECT * FROM tb_transactions ORDER BY id";
        List<Transaction> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("document_id"),
                    rs.getBigDecimal("balance")
                );
                Transaction transaction = new Transaction(
                    rs.getInt("id"),
                    account,
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getInt("value"),
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
            ps.setInt(4, transaction.getValue());
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
