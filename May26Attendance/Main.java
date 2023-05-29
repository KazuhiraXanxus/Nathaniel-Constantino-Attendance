public class Main {

	public static void main(String[] args) {
		Vehicles vehicle = new Vehicles();  // Create an instance of the Vehicles class
		Car car = new Car();  // Create an instance of the Car class

		
		vehicle.model();  // Call the model() method from the Vehicles class
		car.model();  // Call the model() method from the Car class
		vehicle.run();  // Call the run() method from the Vehicles class
		car.run();  // Call the run() method from the Car class
		vehicle.Tires();  // Call the Tires() method from the Vehicles class
		car.Tires();  // Call the Tires() method from the Car class
		vehicle.Color();  // Call the Color() method from the Vehicles class
		car.Color();  // Call the Color() method from the Car class
		vehicle.Speed();  // Call the Speed() method from the Vehicles class
		car.Speed();  // Call the Speed() method from the Car class
		vehicle.Price();  // Call the Price() method from the Vehicles class
		car.Price();  // Call the Price() method from the Car class
		vehicle.Stop();  // Call the Stop() method from the Vehicles class
		car.Stop();  // Call the Stop() method from the Car class
	}

}