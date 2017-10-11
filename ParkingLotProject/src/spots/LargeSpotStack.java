package spots;

import java.util.Stack;

public class LargeSpotStack extends ParkingSpotStack{
	
	private static Stack<ParkingSpot> spotCollection = new Stack<ParkingSpot>();

	public LargeSpotStack() {
		spotCollection.push(new LargeSpot("C1"));
		spotCollection.push(new LargeSpot("C2"));
		spotCollection.push(new LargeSpot("C3"));
		spotCollection.push(new LargeSpot("C4"));
		spotCollection.push(new LargeSpot("C5"));
	}
	
	
	public Stack<ParkingSpot> getSpotCollection() {
		return spotCollection;
	}
}
