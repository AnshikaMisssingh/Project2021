package next.xadmin.login.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.xadmin.login.bean.LoginBean;
import next.xadmin.login.database.CreateDao;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/Create")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
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
		String permissions = request.getParameter("permissions");
		String userid = request.getParameter("userid");
		String role = request.getParameter("role");
		
		LoginBean loginBean = new LoginBean();
		
		loginBean.setId(id);
		loginBean.setPassword(password);
		loginBean.setPermissions(permissions);
		loginBean.setUserid(userid);
		loginBean.setRole(role);
		
		
		CreateDao createDao = new CreateDao();
		String result = createDao.CreateAccount(loginBean);
		if(result.equals("SUCCESS"))
		{
			RequestDispatcher req = request.getRequestDispatcher("Admin.jsp");
			req.include(request, response);
		}
		else 
		{
			RequestDispatcher req = request.getRequestDispatcher("Log.jsp");
			req.include(request, response);
		}
		
		
		
	}

}
