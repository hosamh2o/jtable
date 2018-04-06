package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectiondb {

	private final String url = "jdbc:postgresql://localhost/test";
	private final String user = "postgres";
	private final String pass = "";
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static Connection con = null;
	
	public void connectiondb() throws SQLException {
		
	}

	public Connection getConnection() throws SQLException {
		con = DriverManager.getConnection(url,user,pass);
		return con;
		
	}
	public void closeConnection() throws SQLException {
	 con.close();
	}
		

		
	
}
