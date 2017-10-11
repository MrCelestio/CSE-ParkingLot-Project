package spots;

public class SmallSpot extends ParkingSpot { // Parking spot class for Small spots
	private String location;
	private int size = 0;// predetermined size of 0 for small
	
	
	public SmallSpot(String location, int size) {
		this.location = location;
	}
	public SmallSpot() {
		
	}
	
	public SmallSpot(String location) {
		
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public String getLocation() {
		return location;
	}
	
	
}
