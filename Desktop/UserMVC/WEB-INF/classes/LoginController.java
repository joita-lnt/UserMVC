

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
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
      public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User u=new User();
		u.setEmail(email);
		u.setPassword(password);
		
		UserDAO userDao=new UserDAO();
		
		User user=userDao.authenticateUser(u);
		
		if(user!=null)
		{
			session.setAttribute("user",user);
			RequestDispatcher rd=request.getRequestDispatcher("/loggedIn.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/login.jsp?message=failed");
			rd.forward(request, response);
		}
		
	}

}
