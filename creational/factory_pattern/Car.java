package creational.factory_pattern;

public class Car implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Driving a Car");
	}
}