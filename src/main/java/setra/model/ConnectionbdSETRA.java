package setra.model;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionbdSETRA {
	private static final String SERVER = "3.212.18.62";
	private static final String PORT = "3306";
	private static final String USER = "openserv_setra";
	private static final String PASSWORD = "S3.tra2022";
	private static final String DATABASE = "openserv_bdsetra";
	
	
	public static String TestingConnection() { 
		String result = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String ConnectionString = String.format("jdbc:mysql://%s:%s/%s", SERVER, PORT, DATABASE);
			Connection cn = DriverManager.getConnection(ConnectionString, USER, PASSWORD);
			result = "Conexión establecida con éxito! (" + cn.getCatalog() + ")";
		}catch(Exception ex) { 
			result = "Error en la conexión: \n"+ ex.getMessage();
		}
		return result;
	}
	
	public static Connection GetConnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String ConnectionString = String.format("jdbc:mysql://%s:%s/%s", SERVER, PORT, DATABASE);
			cn = DriverManager.getConnection(ConnectionString, USER, PASSWORD);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return cn;
	}
}
