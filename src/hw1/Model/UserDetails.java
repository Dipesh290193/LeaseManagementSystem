package hw1.Model;


public class UserDetails {

	private int id;
	private String username;
	private String email;
	private String password;
	private long contact;
	private int numpeople;
	private String occupation;
	private String needDate;
	private int userRole;
	private String preference;
	private String type;
	public UserDetails(int id, String username, String email, String password,
			long contact, int numPeople, String occupation, String needDate,String preference,String type,
			int userRole) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.numpeople = numPeople;
		this.occupation = occupation;
		this.needDate = needDate;
		this.preference=preference;
		this.type=type;
		this.userRole = userRole;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public int getNumpeople() {
		return numpeople;
	}

	public void setNumpeople(int numpeople) {
		this.numpeople = numpeople;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getNeedDate() {
		return needDate;
	}

	public void setNeedDate(String needDate) {
		this.needDate = needDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
}
