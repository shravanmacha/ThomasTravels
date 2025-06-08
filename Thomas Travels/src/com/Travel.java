package com;

public class Travel {
	
	Driver[] drivers;
	
	public Travel() {
		
	}
	
	public Travel(Driver[] drivers) {
		super();
		this.drivers = drivers;
	}	
	
	public boolean isCarDriver(Driver driver) {
		if(driver.getCategory() == "car") {
			return true;
		}else {
			return false;
		}
	}
	
	public String retrieveByDriverId(Driver[] driver, int driverId) {
		for(int i=0; i<drivers.length;i++) {
			if(driver[i].getDriverId() == driverId) {
				return "Driver name is " + driver[i].getDriverName() + " " + "Belonging to the category " + driver[i].getCategory() + " " + "travelled " + driver[i].getTotalDistance() + " " + "KM so far.";
			}
		}
		return "Driver not available" ;
	}

	public int retrieveCountOfDriver(Driver[] driver, String category) {
		int count = 0;
		for(int i=0;i<drivers.length;i++) {
			if(driver[i].getCategory() == category) {
				count++;
			}
		}
		return count;
		
	}
	
	public Driver[] retrieveDriver(Driver[] driver, String category) {
		int count =  retrieveCountOfDriver(driver, category);
		Driver[] result = new Driver[count];
		int index = 0;
		
		for(int i=0;i<drivers.length;i++) {
			if(driver[i].getCategory() == category) {
				result[index] = driver[i];
				index++;
			}
		}
		return result;
	}
	
	public Driver retrieveMaximumDistanceTravelledDriver(Driver[] driver) {
		Driver maxDriver = drivers[0];
		for(int i=0;i<driver.length;i++) {
			if(driver[i].getTotalDistance() > maxDriver.getTotalDistance()) {
				maxDriver = driver[i];
			}
		}
		return maxDriver;
	}

}
