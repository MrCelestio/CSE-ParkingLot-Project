package spots;

public class SmallSpot extends ParkingSpot {
	private String location;
	private int size = 0;
	
	
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
