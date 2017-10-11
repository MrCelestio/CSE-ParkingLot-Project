package spots;

import java.util.Stack;

public class SmallSpotStack extends ParkingSpotStack {
	
	private static Stack<ParkingSpot> spotCollection = new Stack<ParkingSpot>();

	public SmallSpotStack() {
		spotCollection.push(new SmallSpot("A1"));
		spotCollection.push(new SmallSpot("A2"));
		spotCollection.push(new SmallSpot("A3"));
		spotCollection.push(new SmallSpot("A4"));
		spotCollection.push(new SmallSpot("A5"));
	}

	
	public Stack<ParkingSpot> getSpotCollection() {
		return spotCollection;
	}

		
		
	
	
	

}
