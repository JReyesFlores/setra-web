package setra.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionbdSETRA {
	private static final String SERVER = "localhost";
	private static final String PORT = "3306";
	private static final String USER = "root";
	private static final String PASSWORD = "Sistemas10";
	private static final String DATABASE = "appopenser_bdsetra";

	public static Connection GetConnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String ConnectionString = String.format("jdbc:mysql://%s:%s/%s", SERVER, PORT, DATABASE);
			cn = DriverManager.getConnection(ConnectionString, USER, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return cn;
	}
}
