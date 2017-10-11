package parkingLot;

import java.util.LinkedList;

import vehicles.Vehicle;

public class ParkedCars {
	private static LinkedList<Vehicle> parkedCarsList = new LinkedList<Vehicle>();
	
	public ParkedCars() {
		
	}

	public static LinkedList<Vehicle> getParkedCarsList() {
		return parkedCarsList;
	}
		
	public static void parkCar(Vehicle vehicle) throws Exception {
		
		vehicle.setLocation(AvailableSpots.pickParkingSpot(vehicle.getSize()));
		getParkedCarsList().push(vehicle);
		
		
		
	}
	
	public static boolean retrieveCar(Vehicle vehicle) {
		
		
		return AvailableSpots.returnParkingSpot(vehicle.getLocation());
	}
}
