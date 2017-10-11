package spots;

public class LargeSpot extends ParkingSpot {// Parking spot class for Large spots
	private String location;
	private final int size = 2;// predetermined size of 2 for Large
	
	
	public LargeSpot() {
	
	}
	
	public LargeSpot(String location) {
	
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}
}
