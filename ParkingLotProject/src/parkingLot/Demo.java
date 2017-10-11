package parkingLot;

import spots.*;
import vehicles.*;


public class Demo {

	public static void main(String[] args) throws Exception {
		
		
		new AvailableSpots();
		new ParkedCars();
		
		
		AvailableSpots.listAvailableSpots();
		AvailableSpots.returnParkingSpot(new MediumSpot("B18"));
		AvailableSpots.listMediumSpots();
		System.out.println(AvailableSpots.pickParkingSpot(1).getLocation());
		System.out.println(AvailableSpots.pickParkingSpot(1).getLocation());
		
		SmallVehicle bike = new SmallVehicle("123der", "Yellow");
		
		ParkedCars.parkCar(bike);
		
		AvailableSpots.listAvailableSpots();
		
		System.out.println(ParkedCars.retrieveCar(bike));
		
		AvailableSpots.listAvailableSpots();
		

	}

}
