package next.xadmin.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection createConnection() {
		
		Connection con = null;
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUname = "hr";
		String dbPassword = "hr";
		String dbDriver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}
