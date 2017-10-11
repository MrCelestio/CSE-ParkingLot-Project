package spots;

public class ExtraLargeSpot extends ParkingSpot {
	private String location;
	private final int size = 3;
	
	
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
