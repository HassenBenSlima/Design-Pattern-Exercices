package iit.implimentation.com;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

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

	public void mesureChanged(float t, float p, float h) {
		setTemperature(t);
		setPressure(p);
		setHumidity(h);
		setChanged();
		notifyObservers();
	}

}
