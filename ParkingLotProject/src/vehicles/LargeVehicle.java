package vehicles;

import spots.ParkingSpot;

public class LargeVehicle extends Vehicle implements  Payment {
	
	
	
	public LargeVehicle(String license, String color) {
		super(license, color, 0);
		
	}

	public LargeVehicle(String license, String color, int size, ParkingSpot location) {
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
