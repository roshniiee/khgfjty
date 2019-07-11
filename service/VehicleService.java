package service;


import java.util.Scanner;

import bean.Vehicle;
import dao.VehicleDAOImpl;
import ui.VehicleView;

public class VehicleService {
	VehicleView ob=new VehicleView();
	Scanner sc=new Scanner(System.in);
	Vehicle v=new Vehicle();
	VehicleDAOImpl daoobj=new VehicleDAOImpl();
	public void addVehicleDetails(Vehicle v,VehicleView id) {
		
		
		daoobj.addVehicle(v,id);
	}
	public Vehicle getVehicleDetails(VehicleView id) {
		v=daoobj.getVehicleDetails(id);
	return v;
		
	}

}
