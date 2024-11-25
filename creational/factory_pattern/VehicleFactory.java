package creational.factory_pattern;

public class VehicleFactory {

	static Vehicle getVehicle(String type){
		if(type.equals("Bike")) {
			return new Bike();
		}else if(type.equals("Car")) {
			return new Car();
		}else {
			return null;
		}
	}
}
