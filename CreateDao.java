package next.xadmin.login.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import next.xadmin.login.bean.LoginBean;
import next.xadmin.login.util.DBConnection;

public class CreateDao {
	
	public String CreateAccount(LoginBean loginBean) {
		
		String id = loginBean.getId();
		String password = loginBean.getPassword();
		String permissions = loginBean.getPermissions();
		String userid = loginBean.getUserid();
		String role = loginBean.getRole();
		
		Connection conn = null;
		String r = null;
		int result = 0;
		
		
		
		try {
			conn = DBConnection.createConnection();
			String insert_sql = "INSERT INTO LOGIN(ID, PASSWORD, PERMISSIONS, USER_ID, ROLE) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = conn.prepareStatement(insert_sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, permissions);
			preparedStatement.setString(4, userid);
			preparedStatement.setString(5, role);
			
		
			result = preparedStatement.executeUpdate();
			
			if(result!=0)  
			{
				return "SUCCESS";
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return r;
		
		
	}

}
