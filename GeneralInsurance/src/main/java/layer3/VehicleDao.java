package layer3;

import java.util.List;

import layer2.Vehicle;

public interface VehicleDao {

	void addVehicle(Vehicle v);
	List<Vehicle> getVehicle();
	Vehicle getVehicle(int vno);
	//void updateVehicle(Vehicle vno);
	//void deleteVehicle(Vehicle vno);

}
