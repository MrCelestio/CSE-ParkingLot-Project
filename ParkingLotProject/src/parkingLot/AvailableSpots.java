package parkingLot;

import java.util.LinkedList;

import spots.ExtraLargeSpotStack;
import spots.LargeSpotStack;
import spots.MediumSpotStack;
import spots.ParkingSpot;
import spots.ParkingSpotStack;
import spots.SmallSpotStack;

public class AvailableSpots {
	private static LinkedList<ParkingSpotStack> availableSpotsList = new LinkedList<ParkingSpotStack>();
	
	
	public AvailableSpots() {
		availableSpotsList.push(new SmallSpotStack());
		availableSpotsList.add( new MediumSpotStack());
		availableSpotsList.add( new LargeSpotStack());
		availableSpotsList.add(new ExtraLargeSpotStack());
		
		
	}

	
	public static LinkedList<ParkingSpotStack> getAvailableSpotsList() {
		
		return availableSpotsList;
	
	}
	
	public static ParkingSpot pickParkingSpot(int size) throws Exception{
		if (getAvailableSpotsList().get(size).getSpotCollection().isEmpty()) {
			
				if (size == 3) {
			
				System.err.println("There are no more Spots Left");
				throw new Exception("There are no more Spots Left");
				}
			
			return pickParkingSpot(++size);
		}
		return  getAvailableSpotsList().get(size).getSpotCollection().pop();
		
	}
	
	
	public static boolean returnParkingSpot(ParkingSpot spot) {
		int size = spot.getSize();
		
		getAvailableSpotsList().get(size).getSpotCollection().push(spot);
		
		return true;
	}
	
	public static void listSmallSpots() {
		System.out.println("SmallSpots: ");
		getAvailableSpotsList().getFirst().displayStack();
	}
	
	public static void listMediumSpots() {
		System.out.println("MediumSpots: ");
		getAvailableSpotsList().get(1).displayStack();
	}
	
	public static void listLargeSpots() {
		System.out.println("LargeSpots: ");
		getAvailableSpotsList().get(2).displayStack();
	}
	
	public static void listExtraLargeSpots() {
		System.out.println("ExtraLargeSpots: ");
		getAvailableSpotsList().get(3).displayStack();
	}
	
	public static void listAvailableSpots() {
		
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
