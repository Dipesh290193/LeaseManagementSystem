package hw1;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LookUpApartment")
public class LookUpApartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LookUpApartment() {
		super();
	}


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("UserName") == null)
		{
			request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
		}
		request.getRequestDispatcher("WEB-INF/LookUpApartment.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
