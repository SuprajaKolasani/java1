package arrays.inheritanceApp;

import java.util.Scanner;

public class FarmMonitoringApp {

	static void displayMenu() {
		System.out.println("\n===== SMART AGRICULTURE MONITORING =====");
        System.out.println("1. View Soil Sensor report");
        System.out.println("2. View Weather Sensor report");
        System.out.println("3. View Crop Health Sensor report");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		SoilSensor soil= new SoilSensor(101, "Field1", 67, 56);
		WeatherSensor weather= new WeatherSensor(101, "Field1", 67, 56);
		CropHealthSensor crop= new CropHealthSensor(101, "Field1", 67, 56);
		
		 int choice;
		 
		 do {
			 displayMenu();
			 choice=sc.nextInt();
			 
			 switch(choice) {
			 case 1:
				 soil.displayDetails();
				 break;
				 
			 case 2:
				 weather.displayDetails();
				 break;
			 case 3:
				 crop.displayDetails();
				 break;
			 case 4:
				 System.out.println("Exit!!");
				 break;
			 default:
				 System.out.println("Invalid choice. Try again.");
			 }
		 }
		 while(choice<4);
	}

}
