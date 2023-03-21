package layer2;

import java.sql.Date;

public class Vehicle {

	private String rcNumber;
	private int chasisNumber;
	private Date dateOfPurchase;
	private String manufacturer;
	private String engineNumber;
	private String vehicleModel;
	private double cost;
	
	public Vehicle() {
		
		System.out.println("Vehicle ctr()..");
	}

	public String getRcNumber() {
		return rcNumber;
	}

	public void setRcNumber(String rcNumber) {
		this.rcNumber = rcNumber;
	}

	public int getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(int chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [rcNumber=" + rcNumber + ", chasisNumber=" + chasisNumber + ", dateOfPurchase=" + dateOfPurchase
				+ ", manufacturer=" + manufacturer + ", engineNumber=" + engineNumber + ", vehicleModel=" + vehicleModel
				+ ", cost=" + cost + "]";
	}

}

//rcNumber varchar(10) primary key,
//chasisNumber int,
//dateOfPurchase date,
//manufacturer varchar(100),
//engineNumber varchar(50),
//vehicleModel varchar(60),
//cost double