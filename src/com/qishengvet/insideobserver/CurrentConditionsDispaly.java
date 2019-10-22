package com.qishengvet.insideobserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDispaly implements Observer {
	Observable observable;
	private double temperature;
	private double humidity;

	public CurrentConditionsDispaly(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
