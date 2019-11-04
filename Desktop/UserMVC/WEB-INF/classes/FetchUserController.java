

import java.io.IOException;

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
 * Servlet implementation class FetchUserController
 */
@WebServlet("/FetchUserController")
public class FetchUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		
		UserDAO userDao=new UserDAO();
		User u=userDao.getUserById(id);
		
		session.setAttribute("userById",u);
		
		RequestDispatcher rd=request.getRequestDispatcher("/fetchUser.jsp");
		rd.forward(request, response);
		
	}

}
