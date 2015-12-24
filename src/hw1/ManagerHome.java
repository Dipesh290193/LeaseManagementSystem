package hw1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ManagerHome")
public class ManagerHome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManagerHome() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("UserName") == null)
		{
			request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
		}
		request.getRequestDispatcher("WEB-INF/ManagerHome.jsp").forward(request, response);
	}

}
