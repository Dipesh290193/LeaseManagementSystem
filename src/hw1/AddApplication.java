package hw1;

import hw1.Model.Application;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddApplication")
public class AddApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int applicationID=1000;
       
   
    public AddApplication() {
        super();
    }

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			List<Application> application=(List<Application>)getServletContext().getAttribute("application");
			int apartmentID=Integer.parseInt(request.getParameter("apartmentID"));
			int userID=(int)request.getSession().getAttribute("userID");
			application.add(new hw1.Model.Application(++applicationID, userID, apartmentID,null, "Requested", null, null));
			//getServletContext().setAttribute("application", application);
			response.sendRedirect("LookUpApartment");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
