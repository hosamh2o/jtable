package jdbctest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class model {

	private Statement stmt = null;
	private ResultSet rs = null;
	connectiondb con = new connectiondb();
	public Object[] getData() throws SQLException {
		
	stmt = con.getConnection().createStatement();
	rs = stmt.executeQuery("select * from test");
	//Object data[][] = new Object[][];
	Object[] data = new Object[5];
	
	while (rs.next()) {
	 data[0] = rs.getInt("id");
	 data[1] = rs.getString("nom");
	 data[2] = rs.getString("prenom");
	 data[3] = rs.getInt("age");
	 data[4] = rs.getString("ville");
	 
	}

	return data;
	
}
}