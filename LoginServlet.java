package next.xadmin.login.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.xadmin.login.bean.LoginBean;
import next.xadmin.login.database.Login;
import next.xadmin.login.database.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String userid = request.getParameter("userid");
		
		LoginBean loginBean = new LoginBean();
		
		loginBean.setId(id);
		loginBean.setUserid(userid);
		loginBean.setPassword(password);
		
		LoginDao loginDao = new LoginDao();
		Login login = new Login();
		
		try {
				if(loginDao.validate(loginBean))
				{
					/*RequestDispatcher req = request.getRequestDispatcher("Hod.jsp");
					req.include(request, response);*/
					
					String userValidate = login.authenticateuser(loginBean);
					
					if(userValidate.equals("Admin_Role"))
					{
						//System.out.println("logged in");
						RequestDispatcher req = request.getRequestDispatcher("Admin.jsp");
						req.include(request, response);
						
					}
					else if(userValidate.equals("HOD"))
					{
						RequestDispatcher req = request.getRequestDispatcher("Hod.jsp");
						req.include(request, response);
					}
					else if(userValidate.equals("STUDENT"))
					{
						RequestDispatcher req = request.getRequestDispatcher("Student.jsp");
						req.include(request, response);
					}
					else if(userValidate.equals("VC"))
					{
						RequestDispatcher req = request.getRequestDispatcher("VC.jsp");
						req.include(request, response);
					}
					else if(userValidate.equals("SUPERVISOR"))
					{
						RequestDispatcher req = request.getRequestDispatcher("Supervisor.jsp");
						req.include(request, response);
					}
					else if(userValidate.equals("EVALUATOR"))
					{
						RequestDispatcher req = request.getRequestDispatcher("Evaluator.jsp");
						req.include(request, response);
					}
					else
					{
						RequestDispatcher req = request.getRequestDispatcher("Log.jsp");
						req.include(request, response);
					}
					
					
				}
				else {
					    
						RequestDispatcher req = request.getRequestDispatcher("Log.jsp");
						req.include(request, response);
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
