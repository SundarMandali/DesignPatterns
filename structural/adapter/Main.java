package structural.adapter;

public class Main {

	public static void main(String[] args) {
		Celsius celcius=new Celsius(27.0);
		 FahrenheitTemperature fahrenheitTemperature=new TemperatureAdapter(celcius);
		 System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature.getTemperatureInFahrenheit());
	}

}
