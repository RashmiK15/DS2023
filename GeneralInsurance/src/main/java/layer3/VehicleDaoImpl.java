package layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import layer2.Vehicle;

public class VehicleDaoImpl implements VehicleDao{

	Connection conn;
	
	public VehicleDaoImpl() {
		try {
			System.out.println("Loading the driver..");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			System.out.println("Connecting to db..");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root123");
			
			System.out.println("Connected to db: "+conn);
			
		}
		catch(SQLException e) {
			System.out.println("Exception thrown: "+e);
		}
	}

	@Override
	public void addVehicle(Vehicle v) {
		try {

			PreparedStatement pst = conn.prepareStatement("INSERT INTO VEHICLE (rcNumber, chasisNumber, dateOfPurchase, manufacturer, engineNumber, vehicleModel, cost) VALUES(?,?,?,?,?,?,?)");
			System.out.println("3. Statement created....");

			//pst.setInt(1, e.getCurrencyId());
			pst.setString(1, v.getRcNumber());
			pst.setInt(2, v.getChasisNumber());
			pst.setDate(3, v.getDateOfPurchase());
			pst.setString(4,  v.getManufacturer());
			pst.setString(5,  v.getEngineNumber());
			pst.setString(6,  v.getVehicleModel());
			pst.setDouble(7,  v.getCost());

			int rows = pst.executeUpdate(); // run the insert query

			System.out.println("4. executed the query: " + rows + " row(s) inserted");

		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public List<Vehicle> getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehicle getVehicle(int vno) {
		// TODO Auto-generated method stub
		return null;
	}

}
