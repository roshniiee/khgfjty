package dao;

import java.util.HashMap;

import bean.Vehicle;
import ui.VehicleView;

interface VehicleDAO{
	public void addVehicle(Vehicle vehicle,VehicleView id);
	public Vehicle getVehicleDetails(VehicleView id);	
}

public class VehicleDAOImpl implements VehicleDAO {


	HashMap<VehicleView,Vehicle> hash = new HashMap<VehicleView,Vehicle>();
	Vehicle v=new Vehicle();
	@Override
	public void addVehicle(Vehicle vehicle,VehicleView id) {
		
		
		hash.put(id,vehicle);
	System.out.println("ADDED");
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehicle getVehicleDetails(VehicleView id) {
		v=hash.get(id);
		
		return v;
	}

}
