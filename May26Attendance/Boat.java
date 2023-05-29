public class Boat extends Vehicles {
	
	@Override
	void model() {
		System.out.println("Fandango Yacht");  // Print the model of the boat
	}
	
	void run() {
		System.out.println("Cruise along the waves");  // Print a message indicating that the boat is running
	}
	
	void Tires() {
		System.out.println("Has none");  // Print a message indicating that the boat does not have tires
	}
	
	void Color() {
		System.out.println("White primary and Surf Blue as secondary color");  // Print the colors of the boat
	}
	
	void Speed() {
		System.out.println("24 knots or 44 kph");  // Print the speed of the boat
	}
	
	void Price() {
		System.out.println("Currently not for sale");  // Print a message indicating that the boat is not for sale
	}
	
	void Stop() {
		System.out.println("The captain has sailed the ship");  // Print a message indicating that the boat has stopped
	}
}
