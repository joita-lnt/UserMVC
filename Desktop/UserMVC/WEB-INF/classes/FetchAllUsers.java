

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.User;
import com.lti.UserDAO;

/**
 * Servlet implementation class FetchAllUsers
 */
@WebServlet("/FetchAllUsers")
public class FetchAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		UserDAO userDao=new UserDAO();
		ArrayList<User> list=userDao.getAllUsers();
		
		HttpSession session=request.getSession();
		session.setAttribute("userList",list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/showAllUsers.jsp");
		rd.forward(request, response);
		
	}

}
