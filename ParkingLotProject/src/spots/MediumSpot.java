package spots;

public class MediumSpot extends ParkingSpot {// Parking spot class for Medium spots
	private String location;
	private final int size = 1;// predetermined size of 1 for medium
	
	
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
