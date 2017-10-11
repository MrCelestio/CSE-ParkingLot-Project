package spots;

import java.util.Stack;

public abstract class ParkingSpotStack {

	private static Stack<ParkingSpot> spotCollection = new Stack<ParkingSpot>();

	public ParkingSpotStack() {
		
	}

	
	public Stack<ParkingSpot> getSpotCollection() {
		return spotCollection;
	}
	
	public void displayStack() {
			System.out.println("Available Locations : " + getSpotCollection().size());
			
			for(int i = 0 ; i < getSpotCollection().size() ; i++) {
				
				System.out.print(getSpotCollection().get(i).getLocation() + " ");
				
			}
			System.out.println();
	}

}
