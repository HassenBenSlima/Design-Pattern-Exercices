package iit.implimentation.com;
import java.util.ArrayList;
import java.util.List;

import iit.interfaces.com.Observer;
import iit.interfaces.com.Subject;

public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;
	
	private List<Observer> observers = new ArrayList<>();

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;

	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	@Override
	public void registerObserver(Observer o) {

		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(temperature, pressure, humidity);
		}

	}

	public void mesureChanged(float t, float p, float h) {
		setTemperature(t);
		setPressure(p);
		setHumidity(h);
		notifyObserver();
	}

}
