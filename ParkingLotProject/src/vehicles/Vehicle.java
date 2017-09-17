package vehicles;

import java.awt.Color;

public abstract class Vehicle { //abstract class for vehicles to be used as blueprint
	long license;               // the license information for cars to be located
	Color color;                // color information (never hurts for extra details)
	int size;                   // size indicator (1 small , 2 medium, 3 large, 4 extra large) to efficiently determine available parking spot options
	ParkingSpot location;       // stores parking spot information for ease of locating and recycling parking spot

}
