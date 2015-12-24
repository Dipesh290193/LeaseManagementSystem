package hw1;

import hw1.Model.Apartment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewApartment")
public class ViewApartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewApartment() {
		super();
	}
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("id") != null)
		{
			List<Apartment> apartment = (List<Apartment>) getServletContext()
					.getAttribute("apartment");
			int id = Integer.parseInt(request.getParameter("id"));
			for (Apartment apartments : apartment) {
				if (apartments.getId() == id) {
					apartments.setAvailable(true);
				}
			}
			response.sendRedirect("ViewApartment");
		}
		else
		{
			if(request.getSession().getAttribute("UserName") == null)
			{
				request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
			}
			request.getRequestDispatcher("WEB-INF/ViewApartment.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
	}

}
