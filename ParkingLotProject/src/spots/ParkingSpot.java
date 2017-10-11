package spots;

public class ParkingSpot {
	private String location;
	private int size;
	
	public ParkingSpot() {
		
		size = 1;
	}
	
	public ParkingSpot(String location, int size) {
		
		this.location = location;
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}
	
	
}
