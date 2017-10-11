package spots;

public class MediumSpot extends ParkingSpot {
	private String location;
	private final int size = 1;
	
	
	public MediumSpot() {
		
	}
	
	public MediumSpot(String location) {
		
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}
}
