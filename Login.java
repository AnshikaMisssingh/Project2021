package next.xadmin.login.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import next.xadmin.login.bean.LoginBean;
import next.xadmin.login.util.DBConnection;

public class Login {
	
	public String authenticateuser(LoginBean loginBean)
	{
		String UserId = loginBean.getUserid();
		
		Connection con = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		String useridDB = "";
		String roleDB = "";
		
		
		try {
			con = DBConnection.createConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery("SELECT USER_ID, ROLE FROM LOGIN");
			
			while(resultset.next())
			{
				useridDB = resultset.getString("USER_ID");
				roleDB = resultset.getString("ROLE");
				
				if(UserId.equals(useridDB) && roleDB.equals("ADMIN"))
				    return "Admin_Role";
				else if(UserId.equals(useridDB) && roleDB.equals("HOD"))
					return "HOD";
				else if(UserId.equals(useridDB) && roleDB.equals("STUDENT"))
					return "STUDENT";
				else if(UserId.equals(useridDB) && roleDB.equals("VC"))
					return "VC";
				else if(UserId.equals(useridDB) && roleDB.equals("SUPERVISOR"))
					return "SUPERVISOR";
				else if(UserId.equals(useridDB) && roleDB.equals("EVALUATOR"))
					return "EVALUATOR";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return "Invalid User Credentials";
		
	}

}
