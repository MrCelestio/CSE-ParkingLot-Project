package vehicles;

import spots.ParkingSpot;

//class for Small Vehicles. Implements Payment method
public class ExtraLargeVehicle extends Vehicle implements  Payment {
	
	
	
	public ExtraLargeVehicle(String license, String color) {
		super(license, color, 3);
		
	}

	public ExtraLargeVehicle(String license, String color, int size, ParkingSpot location) {
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
