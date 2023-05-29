
public class Main {

	public static void main(String[] args) {
	Vehicles vehicle = new Vehicles();
	Car car = new Car();
	Plane plane = new Plane();
	Boat boat = new Boat();
	
	vehicle.model();
	car.model();
	vehicle.run();
	car.run();
	vehicle.Tires();
	car.Tires();
	vehicle.Color();
	car.Color();
	vehicle.Speed();
	car.Speed();
	vehicle.Price();
	car.Price();
	vehicle.Stop();
	car.Stop();
	
	}

}
