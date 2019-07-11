package ui;

import java.util.Random;
import java.util.Scanner;

public class DistributorView {
	Scanner sc=new Scanner(System.in);
	Random randomobj=new Random();
	
	public void DistributorDetails()
	{
	System.out.println("enter the details:");
	System.out.println("distributor name = ");
	String distributorname=sc.next();
	System.out.println("distributor name = "+distributorname);
	System.out.println("address = ");
	String address=sc.next();
	System.out.println("address = "+address);
	System.out.println("mobile no = ");
	String mobno=sc.next();
	System.out.println("mobile no = "+mobno);
	System.out.println("details added Successfully!");
	int distributorid=randomobj.nextInt(100);
	System.out.println("distributor id  "+distributorid);
	
	}

	public void getDistributorDetails() {
		// TODO Auto-generated method stub
		
	}
	

}
