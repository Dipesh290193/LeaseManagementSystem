package hw1.Model;

public class Apartment {

	private int id;
	private String apartmentNo;
	private String type;
	private String facilities;
	private int maximumPeople;
	private double rent;
	private double deposits;
	private boolean available;

	public Apartment(int id, String apartmentNo, String type, String facilities,
			int maximumPeople, double rent, double deposits,boolean available) {
		this.id = id;
		this.apartmentNo = apartmentNo;
		this.type = type;
		this.facilities = facilities;
		this.maximumPeople = maximumPeople;
		this.rent = rent;
		this.deposits = deposits;
		this.available=available;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(String apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFacilities() {
		return facilities;
	}

	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}

	public int getMaximumPeople() {
		return maximumPeople;
	}

	public void setMaximumPeople(int maximumPeople) {
		this.maximumPeople = maximumPeople;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getDeposits() {
		return deposits;
	}

	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}

}
