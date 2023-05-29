public class Plane extends Vehicles {
	@Override
	void model() {
		System.out.println("U-2 SPY PLANE");  // Print the model of the plane
	}
	
	void run() {
		System.out.println("Flew out of the runway");  // Print a message indicating that the plane is running
	}
	
	void Tires() {
		System.out.println("2 wheels");  // Print the number of wheels of the plane
	}
	
	void Color() {
		System.out.println("Black");  // Print the color of the plane
	}
	
	void Speed() {
		System.out.println("528 mph");  // Print the speed of the plane
	}
	
	void Price() {
		System.out.println("120 million dollars");  // Print the price of the plane
	}
	
	void Stop() {
		System.out.println("Landing!");  // Print a message indicating that the plane is stopping
	}
}