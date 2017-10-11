package spots;

import java.util.Stack;

public class ExtraLargeSpotStack extends ParkingSpotStack{// collection of ExtraLarge parking spots
	
	private static Stack<ParkingSpot> spotCollection = new Stack<ParkingSpot>();

	public ExtraLargeSpotStack() {//collection filled with appropriate Parking spots
		spotCollection.push(new ExtraLargeSpot("D1"));
		spotCollection.push(new ExtraLargeSpot("D2"));
		spotCollection.push(new ExtraLargeSpot("D3"));
		spotCollection.push(new ExtraLargeSpot("D4"));
		spotCollection.push(new ExtraLargeSpot("D5"));
	}
	
	public Stack<ParkingSpot> getSpotCollection() {
		return spotCollection;
	}
	

}
