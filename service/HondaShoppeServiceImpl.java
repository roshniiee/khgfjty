package service;

import service.HondaShoppe;
import bean.Vehicle;

import java.util.HashMap;

import bean.Distributor;
interface HondaShoppe{
	//public void addVehicleDistributor (HashMap<Vehicle,Distributor>);
	public HashMap<Vehicle,Distributor>getDistributor();
	public void addVehicleDistributor();
	public HashMap<Vehicle,Distributor>getVehicle();
		}

public class HondaShoppeServiceImpl implements HondaShoppe {

	@Override
	public void addVehicleDistributor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<Vehicle, Distributor> getDistributor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Vehicle, Distributor> getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

}
