package structural.adapter;

public class TemperatureAdapter implements FahrenheitTemperature {
	private Celsius celsiusTemperature;
	// Constructor
    public TemperatureAdapter(Celsius celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }
	@Override
	public double getTemperatureInFahrenheit() {
		double celsius = celsiusTemperature.getTemperatureInCelsius();
		return celsius * 9 / 5 + 32; // Conversion formula
	}

}
