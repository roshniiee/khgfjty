package ui;

import java.util.Random;
import java.util.Scanner;

import bean.Vehicle;
import service.VehicleService;
//import bean.Vehicle.CarType;
public class VehicleView {
	Scanner sc=new Scanner(System.in);
	Vehicle v;
	VehicleView v1;
	/*VehicleService s;*/
	Random randomobj=new Random();
	VehicleService serviceobj=new VehicleService();
	public VehicleView(int vehicleid) {
		// TODO Auto-generated constructor stub
	}

	public VehicleView() {
		// TODO Auto-generated constructor stub
	}

	public void VehicleDetails() 
	{
		System.out.println("enter the details:");
		System.out.println("modelName = ");
		String modelname=sc.next();
		System.out.println("modelName = "+modelname);
		System.out.println("Price = ");
		double price=pricecheck(sc.nextInt());
		System.out.println("Price = "+price);
		
		System.out.println("CarType = ");
		String type = sc.next();
		 System.out.println("CarType = "+type);
		
		
		System.out.println("details added Successfully!");
		
		int vehicleid=randomobj.nextInt(100);
		System.out.println("vehicle id "+vehicleid);
		
		v=new Vehicle(modelname,price,type);
		v1=new VehicleView(vehicleid);
		/*s=new VehicleService();
*/        serviceobj.addVehicleDetails(v,v1);
       Vehicle v= serviceobj.getVehicleDetails(v1);
       System.out.println(v);
/*    s.getVehicleDetails(v1);*/
	}
	
	public int pricecheck(int price) {
		try {
			if(price<500000)
			{
				System.out.println("PriceException");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return price;
	}



}
