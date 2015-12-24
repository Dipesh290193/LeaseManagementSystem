package hw1;

import hw1.Model.Apartment;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddApartment")
public class AddApartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int aptId = 200;

	public AddApartment() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("UserName") == null)
		{
			request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
		}
		request.getRequestDispatcher("WEB-INF/AddApartment.jsp").forward(request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try
		{		
		List<Apartment> apartment = (List<Apartment>) getServletContext()
				.getAttribute("apartment");
		String apartmentNo = request.getParameter("apartment");
		String type = request.getParameter("type");
		String facilities = request.getParameter("facilities");
		int maximunPeople = Integer.parseInt(request.getParameter("people"));
		double rent = Double.parseDouble(request.getParameter("rent"));
		double deposits = Double.parseDouble(request.getParameter("deposits"));
		if(apartmentNo.equals(null) || apartmentNo.trim().equals("") || type.equals(null) || type.trim().equals("") || facilities.equals(null) || facilities.trim().equals("")
				|| maximunPeople <= 0 || rent <=0 || deposits <= 0)
		{
			request.setAttribute("error", "All Field Required!\n Maximum people, Rent, Deposits should be greater than zero ");
			request.getRequestDispatcher("WEB-INF/AddApartment.jsp").forward(request, response);
		}
		apartment.add(new Apartment(++aptId, apartmentNo, type, facilities,
				maximunPeople, rent, deposits,false));
		response.sendRedirect("ViewApartment");
		}catch(Exception e)
		{
			request.setAttribute("error", "All Field Required!\n Maximum people, Rent, Deposits should be greater than zero ");
			request.getRequestDispatcher("WEB-INF/AddApartment.jsp").forward(request, response);
		}
	}

}
