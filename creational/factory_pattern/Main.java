package creational.factory_pattern;

public class Main {

	public static void main(String[] args) {
		//encapsulating the object creation logic from client side
		Vehicle car=VehicleFactory.getVehicle("Car");
		Vehicle bike=VehicleFactory.getVehicle("Bike");
		car.drive();
		bike.drive();
	}

}
