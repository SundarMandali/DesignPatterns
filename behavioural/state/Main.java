package behavioural.state;

public class Main {
	public static void main(String[] args) {
		Fan fan = new Fan();

		// Press the button multiple times
		fan.pressButton(); // Output: Turning fan to Low speed.
		fan.pressButton(); // Output: Turning fan to High speed.
		fan.pressButton(); // Output: Turning fan Off.
		fan.pressButton(); // Output: Turning fan to Low speed.
	}
}
