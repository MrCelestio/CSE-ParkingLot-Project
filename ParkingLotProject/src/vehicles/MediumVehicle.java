package vehicles;

import spots.ParkingSpot;

public class MediumVehicle extends Vehicle implements  Payment {
	
	
	
	public MediumVehicle(String license, String color) {
		super(license, color, 0);
		
	}

	public MediumVehicle(String license, String color, int size, ParkingSpot location) {
		super(license, color, size, location);
		
	}

	
	public double payHourly() {
		
		return 3.50;
	}

	
	public double payDaily() {
		
		return 12.00;
	}

	
	public double payMonthly() {
		
		return 25.00;
	}

	

	

}
