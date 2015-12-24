package hw1;

import hw1.Model.Application;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppointmentAcceptDeny")
public class AppointmentAcceptDeny extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AppointmentAcceptDeny() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Application> application=(List<Application>)getServletContext().getAttribute("application");
		int applicationID=Integer.parseInt(request.getParameter("id"));
		String decision=request.getParameter("decision");
		if(decision.equals("Accept"))
		{
			for (Application applications : application) {
				if(applications.getApplicationID()== applicationID)
				{
					applications.setStatus("Accept");
				}
			}
		}
		if(decision.equals("Deny"))
		{
			for (Application applications : application) {
				if(applications.getApplicationID()== applicationID)
				{
					applications.setStatus("Deny");
					applications.setRuledOutDate(applications.getAppointmentDate());					
				}
			}
		}
		response.sendRedirect("LookUpApartment");
	}

}
