package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.models.Account;

public class AccountDao {
    private Connection connection;

    public AccountDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Account account) {
        String sql = "INSERT INTO tb_accounts(id, name, document_id, balance) VALUES (acc_acc.NEXTVAL, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, account.getName());
            ps.setString(2, account.getDocument_id());
            ps.setBigDecimal(3, account.getBalance());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Account> getAll() {
        String sql = "SELECT * FROM tb_accounts ORDER BY id";
        List<Account> list = new ArrayList<>();
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
                list.add(account);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void update(Account account) {
        String sql = "UPDATE tb_accounts SET name = ?, document_id = ?, balance = ? WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, account.getName());
            ps.setString(2, account.getDocument_id());
            ps.setBigDecimal(3, account.getBalance());
            ps.setInt(4, account.getId());
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int accountId) {
        String sql = "DELETE FROM tb_accounts WHERE id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, accountId);
            ps.executeUpdate();
            ps.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
