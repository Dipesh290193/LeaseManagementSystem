package hw1;

import hw1.Model.Apartment;
import hw1.Model.Application;
import hw1.Model.UserDetails;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Login", loadOnStartup = 1)
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		List<UserDetails> userDetails = new ArrayList<UserDetails>();
		userDetails.add(new UserDetails(1, "jdoe", "jdoe", "admin", 657253946,
				0, null, null,null,null, 1));
		config.getServletContext().setAttribute("userDetails", userDetails);
		List<Apartment> apartment = new ArrayList<Apartment>();
		apartment.add(new Apartment(100, "12", "1BHK", "AC", 5, 1450, 1000, false));
		config.getServletContext().setAttribute("apartment", apartment);
		List<Application> application=new ArrayList<Application>();
		application.add(new Application(1000, 100, 100, null, "Requested", null, null));
		config.getServletContext().setAttribute("application",application);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<UserDetails> userDetails = (List<UserDetails>) getServletContext()
				.getAttribute("userDetails");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(email.equals(null) || email.trim().equals("") || password.equals(null) || password.trim().equals(""))
		{
			request.setAttribute("error", "All field required!");
			request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
		}
		boolean flag=false;
		for (UserDetails userDetail : userDetails) {
			if (userDetail.getEmail().equals(email)
					&& userDetail.getPassword().equals(password)) 
			{
				flag=true;
				request.getSession().setAttribute("email", email);
				request.getSession().setAttribute("UserName",userDetail.getUserName());
				request.getSession().setAttribute("userID", userDetail.getId());
				
				if (userDetail.getUserRole() == 1) {
					
					request.getSession().setAttribute("role", 1);
					response.sendRedirect("ManagerHome");
					return;
				}
				else if(userDetail.getUserRole()==2)
				{
					request.getSession().setAttribute("role", 2);
					response.sendRedirect("LookUpApartment");
					return;
				}
			}
		}
		if(!flag)
		{
			request.setAttribute("error", "Email and Password Doesn't match");
			request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
		}
		
		
	}

}
