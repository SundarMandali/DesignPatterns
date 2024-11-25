package structural.adapter;

public class Celsius {
	
	private double celsius_temp;
	public Celsius(double celsius_temp) {
		this.celsius_temp=celsius_temp;
	}
	
	public double getTemperatureInCelsius() {
        return this.celsius_temp; // Example: 25°C
    }
}
