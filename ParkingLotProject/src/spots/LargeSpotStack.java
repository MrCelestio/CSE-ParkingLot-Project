package spots;

import java.util.Stack;

public class LargeSpotStack extends ParkingSpotStack{// collection of Large parking spots
	
	private static Stack<ParkingSpot> spotCollection = new Stack<ParkingSpot>();

	public LargeSpotStack() {//collection filled with appropriate Parking spots
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
