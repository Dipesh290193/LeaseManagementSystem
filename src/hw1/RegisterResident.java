package hw1;

import hw1.Model.UserDetails;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterResident")
public class RegisterResident extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int userId = 0;

	public RegisterResident() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/RegisterResident.jsp").forward(
				request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try{
			List<UserDetails> userdetails = (List<UserDetails>) getServletContext()
					.getAttribute("userDetails");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String confirmpassword = request.getParameter("confirmPassword");
			String email = request.getParameter("email");
			long contact = Long.parseLong(request.getParameter("contact"));
			int people = Integer.parseInt(request.getParameter("people"));
			String occupation = request.getParameter("occupation");
			String type = request.getParameter("type");
			String preference = request.getParameter("preference");
			String needDate = request.getParameter("needDate");
			String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
			if (!password.equals(confirmpassword)) {

				request.setAttribute("error",
						"Password and Conformation password doesnot mathch!");
				request.getRequestDispatcher("WEB-INF/RegisterResident.jsp")
						.forward(request, response);
			}
			if (!email.matches(EMAIL_REGEX)) {
				request.setAttribute("error",
						"Enter valid email");
				request.getRequestDispatcher("WEB-INF/RegisterResident.jsp")
						.forward(request, response);
			}
			if (username.equals(null) || username.trim().equals("")
					|| password.equals(null) || password.trim().equals("")
					|| email.equals(null) || email.trim().equals("")
					|| type.equals(null) || type.trim().equals("")
					|| occupation.equals(null) || occupation.trim().equals("")
					|| preference.equals(null) || preference.trim().equals("")
					|| needDate.equals(null) || needDate.trim().equals("")
					|| people <= 0 || contact <= 0) {
				request.setAttribute(
						"error",
						"All field required \n contact and number of people should be greter than zero!");
				request.getRequestDispatcher("WEB-INF/RegisterResident.jsp")
						.forward(request, response);
			}
			userdetails
					.add(new UserDetails(userId, username, email, password,
							contact, people, occupation, needDate, preference,
							type, 2));
			response.sendRedirect("Login");
		}
		catch(Exception e)
		{
			request.setAttribute(
					"error",
					"All field required \n contact and number of people should be greter than zero!");
			request.getRequestDispatcher("WEB-INF/RegisterResident.jsp")
					.forward(request, response);
		}
	}
}
