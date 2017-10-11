package spots;

import java.util.Stack;

public class MediumSpotStack extends ParkingSpotStack{// collection of Medium parking spots
	
	private static Stack<ParkingSpot> spotCollection = new Stack<ParkingSpot>();

	public MediumSpotStack() {//collection filled with appropriate Parking spots
		spotCollection.push(new MediumSpot("B1"));
		spotCollection.push(new MediumSpot("B2"));
		spotCollection.push(new MediumSpot("B3"));
		spotCollection.push(new MediumSpot("B4"));
		spotCollection.push(new MediumSpot("B5"));
	}
	
	
	public Stack<ParkingSpot> getSpotCollection() {
		return spotCollection;
	}
}
