package hw1.Model;


public class Application {	
		
		private int applicationID;
		private int userID;
		private int apartmentID;
		private String appointmentDate;
		private String status;
		private String rescheduleDate;
		private String ruledOutDate;

		public Application(int applicationID,int userID,int apartmentID,String appointmentDate,String status,String rescheduleDate,String ruledOutDate)
		{
			this.applicationID=applicationID;
			this.userID=userID;
			this.apartmentID=apartmentID;
			this.appointmentDate=appointmentDate;
			this.status=status;
			this.rescheduleDate=rescheduleDate;
			this.ruledOutDate=ruledOutDate;
		}

		public String getAppointmentDate() {
			return appointmentDate;
		}

		public void setAppointmentDate(String appointmentDate) {
			this.appointmentDate = appointmentDate;
		}

		public int getApplicationID() {
			return applicationID;
		}

		public void setApplicationID(int applicationID) {
			this.applicationID = applicationID;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public int getApartmentID() {
			return apartmentID;
		}

		public void setApartmentID(int apartmentID) {
			this.apartmentID = apartmentID;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRescheduleDate() {
			return rescheduleDate;
		}

		public void setRescheduleDate(String rescheduleDate) {
			this.rescheduleDate = rescheduleDate;
		}

		public String getRuledOutDate() {
			return ruledOutDate;
		}

		public void setRuledOutDate(String ruledOutDate) {
			this.ruledOutDate = ruledOutDate;
		}
}
