public class Car extends Vehicles {

	@Override
	void model() {
		System.out.println("Toyota-VIOS");  // Print the car model - Toyota VIOS
	}
	
	void run() {
		System.out.println("stepping on the pedal");  // Print a message indicating stepping on the pedal
	}
	
	void Tires() {
		System.out.println("four wheels");  // Print the number of tires - four wheels
	}
	
	void Color() {
		System.out.println("It has Jade, Black, White and Red");  // Print the available colors of the car
	}
	
	void Speed() {
		System.out.println("0-60 is 11 seconds. Top speed is 170 kmph");  // Print the acceleration and top speed of the car
	}
	
	void Price() {
		System.out.println("1,005,000");  // Print the price of the car
	}
	
	void Stop() {
		System.out.println("hit the brakes at nag milly rock");  // Print a message indicating hitting the brakes in a specific manner
	}
}
