
import com.lti.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddUserController
 */
@WebServlet("/UDUserController")
public class UDUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UDUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User u=new User();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		UserDAO userDao=new UserDAO();
		String button=request.getParameter("button");
		if(button.startsWith("Update"))
		{
			
			String result=userDao.updateUser(u);
			System.out.println("Update Status:"+result);
			if(result.equals(Results.SUCCESS))
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("/loggedIn.jsp");
				rd.forward(request, response);
			}
		}
		
		if(button.startsWith("Delete"))
		{
			String result=userDao.deleteUser(u);
			System.out.println("Delete Status:"+result);
			if(result.equals(Results.SUCCESS))
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("/loggedIn.jsp");
				rd.forward(request, response);
			}
		}
		
		
		
		
		
		
	}

}
