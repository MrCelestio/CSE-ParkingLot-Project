package spots;

public class ParkingSpot { // Abstract Class for Parking Spots
	private String location; // location is used as a Representative number of its relative location
	private int size; // size is used to sort out different parking options
	
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
