package com;

public class TestDriver {
	
	public static void main(String[] args) {
		
			Driver[] driver = new Driver[5];
			driver[0] = new Driver(1,"Vamshi","car",1420);
			driver[1] = new Driver(2,"Sampath","lorry",120);
			driver[2] = new Driver(3,"Dinesh","lorry",1440);
			driver[3] = new Driver(4,"Jeevan","car",220);
			driver[4] = new Driver(5,"Tharun","auto",1320);
			
			Travel travel = new Travel(driver);
			boolean result = travel.isCarDriver(driver[3]);
			System.out.println("He is a car driver??");
			System.out.println(result);
			System.out.println();
			
			String infoOfDriver = travel.retrieveByDriverId(driver, 2);
			System.out.println("This is the information of the driver: ");
			System.out.println(infoOfDriver);
			System.out.println();
			
			int countOfDriverCategory = travel.retrieveCountOfDriver(driver, "auto");
			System.out.println("Drivers count " + countOfDriverCategory);
			System.out.println();
			
			Driver[] carDrivers = travel.retrieveDriver(driver, "car");
			System.out.println("Here the drivers list: ");
			for(Driver d: carDrivers ) {
				System.out.println(d.getDriverName());
			}
			System.out.println();
			
			System.out.println("Maximum distance covered driver is: ");
			System.out.println(travel.retrieveMaximumDistanceTravelledDriver(driver));
	}

	
}
