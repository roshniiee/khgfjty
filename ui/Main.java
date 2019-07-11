package ui;

import java.util.Scanner;


/*import dao.*;*/
import service.*;

public class Main {
	public static void main(String args[]) {
		int ch;
		char choice;
		VehicleView vehicleobj=new VehicleView();
		VehicleService serviceobj=new VehicleService();
		//DistributorService serviceobj1=new DistributorService();
		//DistributorView distributorobj=new DistributorView();
		
		
		
		HondaShoppeServiceImpl hondaobj=new HondaShoppeServiceImpl();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n *********************\n MENU\n 1.Add vehicle details  \n 2.add distributor details \n "
					+ "3.Get vehicle details\n 4.Get distributor details 5.Add vehicle to distributor\n 6.exit\n");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				vehicleobj.VehicleDetails();
				break;
			case 2:
				//distributorobj.DistributorDetails();
				break;
             case 3:
            	 serviceobj.getVehicleDetails(vehicleobj);
				break;
             case 4:
            	// serviceobj1.getDistributorDetails();
 				break;
             case 5:
 				hondaobj.addVehicleDistributor();
 				break;
				
             case 6:
				System.out.println("exit");
				System.exit(0);
			}
			System.out.print("Do you want to continue (y/n)...? : ");
			choice = sc.next().charAt(0);
			if(choice == 'y' || choice=='Y')
				continue;
			else {
				System.out.println("Thank You !");
				System.exit(0);
			}
	}while(ch!=4);
		sc.close();

}
}
