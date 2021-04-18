package next.xadmin.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import next.xadmin.login.bean.LoginBean;

public class LoginDao {
	
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
	private String dbUname = "hr";
	private String dbPassword = "hr";
	private String dbDriver = "oracle.jdbc.driver.OracleDriver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(LoginBean loginBean) throws SQLException{
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		boolean status = false;
		
		String sql = "SELECT * FROM LOGIN WHERE ID = ? AND PASSWORD = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, loginBean.getId());
			ps.setString(2, loginBean.getPassword());
			
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	

}
