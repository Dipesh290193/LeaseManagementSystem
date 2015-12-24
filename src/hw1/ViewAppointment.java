package hw1;

import hw1.Model.Application;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAppointment")
public class ViewAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewAppointment() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/ViewAppointment.jsp").forward(request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Application> application=(List<Application>)getServletContext().getAttribute("application");
		String rescheduleDate=request.getParameter("RescheduleDate");
		int applicationID=Integer.parseInt(request.getParameter("applicationID"));
		int apartmentID=Integer.parseInt(request.getParameter("apartmentID"));
		for (Application applications : application) {
			if(applications.getApplicationID()==applicationID)
			{
				applications.setStatus("Scheduled");
				applications.setAppointmentDate(rescheduleDate);
			}
		}
		response.sendRedirect("ViewAppointment?id="+apartmentID);
		
	}

}
