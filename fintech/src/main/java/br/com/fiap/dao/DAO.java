package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private static final String USER = "rm552849";
	private static final String PASSWORD = "050303"; 
	
	
	public static Connection connect()  {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Sucess!");
		} catch (ClassNotFoundException e) {
			System.err.println("Error");
		} catch (SQLException e) {
			System.err.println("Error");
		}
		
		return con;
	}
}
