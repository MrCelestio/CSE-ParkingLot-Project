package parkingLot;

import java.util.LinkedList;

import spots.ExtraLargeSpotStack;
import spots.LargeSpotStack;
import spots.MediumSpotStack;
import spots.ParkingSpot;
import spots.ParkingSpotStack;
import spots.SmallSpotStack;


//this class is used to interact with the Parking spots to retrieve and store Parking spots
//efficiently retrieves the next available Parking spot that suites a vehicles size (low order first)
public class AvailableSpots {
	private static LinkedList<ParkingSpotStack> availableSpotsList = new LinkedList<ParkingSpotStack>();
	
	
	public AvailableSpots() {//preset with sorted size stacks
		availableSpotsList.push(new SmallSpotStack());
		availableSpotsList.add( new MediumSpotStack());
		availableSpotsList.add( new LargeSpotStack());
		availableSpotsList.add(new ExtraLargeSpotStack());
		
		
	}

	
	public static LinkedList<ParkingSpotStack> getAvailableSpotsList() { //used to access static list
		
		return availableSpotsList;
	
	}
	
	public static ParkingSpot pickParkingSpot(int size) throws Exception{ //takes next available parking spot
		if (getAvailableSpotsList().get(size).getSpotCollection().isEmpty()) {
			
				if (size == 3) {
			
				System.err.println("There are no more Spots Left");
				throw new Exception("There are no more Spots Left");
				}
			
			return pickParkingSpot(++size);
		}
		return  getAvailableSpotsList().get(size).getSpotCollection().pop();
		
	}
	
	
	public static boolean returnParkingSpot(ParkingSpot spot) {//adds Parking spot back into the proper stack
		int size = spot.getSize();
		
		getAvailableSpotsList().get(size).getSpotCollection().push(spot);
		
		return true;
	}
	
	public static void listSmallSpots() { //displays small Parking spots that are available
		System.out.println("SmallSpots: ");
		getAvailableSpotsList().getFirst().displayStack();
	}
	
	public static void listMediumSpots() {//displays Medium Parking spots that are available
		System.out.println("MediumSpots: ");
		getAvailableSpotsList().get(1).displayStack();
	}
	
	public static void listLargeSpots() {// displays Large Parking Spots that are available
		System.out.println("LargeSpots: ");
		getAvailableSpotsList().get(2).displayStack();
	}
	
	public static void listExtraLargeSpots() {//displays ExtraLarge Parking spots that are available
		System.out.println("ExtraLargeSpots: ");
		getAvailableSpotsList().get(3).displayStack();
	}
	
	public static void listAvailableSpots() { // displays ALL available Parking Spots
		
		System.out.println("SmallSpots: ");
		getAvailableSpotsList().getFirst().displayStack();
		System.out.println("MediumSpots: ");
		getAvailableSpotsList().get(1).displayStack();
		System.out.println("LargeSpots: ");
		getAvailableSpotsList().get(2).displayStack();
		System.out.println("ExtraLargeSpots: ");
		getAvailableSpotsList().get(3).displayStack();
		
		
	}
	
}
