package spots;

public class ExtraLargeSpot extends ParkingSpot {// Parking spot class for ExtraLarge spots
	private String location;
	private final int size = 3;// predetermined size of 3 for ExtraLarge
	
	
	public ExtraLargeSpot() {
		
	}
	
	public ExtraLargeSpot(String location) {
		
		this.location = location;
	}
	public int getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}
}
