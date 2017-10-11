package spots;

public class LargeSpot extends ParkingSpot {
	private String location;
	private final int size = 2;
	
	
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
