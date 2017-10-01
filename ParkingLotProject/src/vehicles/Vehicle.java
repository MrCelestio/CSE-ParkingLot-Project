package vehicles;

import java.awt.Color;

import spots.ParkingSpot;


public abstract class Vehicle implements Payment { //abstract class for vehicles to be used as blueprint
	String license;               // the license information for cars to be located
	String color;                // color information (never hurts for extra details)
	int size;                   // size indicator (0 small , 1 medium, 2 large, 3 extra large) to efficiently determine available parking spot options
	ParkingSpot location;       // stores parking spot information for ease of locating and recycling parking spot
	
	public Vehicle(String license, String color, int size) {
		this.license = license;
		this.color = color;
		this.size = size;
	}

	public Vehicle(String license, String color, int size, ParkingSpot location ) {
		this.license = license;
		this.color = color;
		this.size = size;
		this.location = location;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ParkingSpot getLocation() {
		return location;
	}

	public void setLocation(ParkingSpot location) {
		this.location = location;
	}
	
	
}
