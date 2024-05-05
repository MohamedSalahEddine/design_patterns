package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static String url = "jdbc:mysql://localhost:3306/example";
	private static String username = "root";
	private static String password = "";
	
	private Database(){
		
	}
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}
