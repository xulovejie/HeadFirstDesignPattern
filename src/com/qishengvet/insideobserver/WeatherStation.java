package com.qishengvet.insideobserver;


public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		// CurrentConditionsDispaly CurrentConditionsDisplay = new CurrentConditionsDispaly(weatherData);
		new CurrentConditionsDispaly(weatherData);
		weatherData.setMeasurements(80, 65, 30.4);
	}
}
