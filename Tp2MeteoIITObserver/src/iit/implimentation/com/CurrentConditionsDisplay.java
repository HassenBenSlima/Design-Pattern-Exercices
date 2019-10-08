package iit.implimentation.com;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData wd = ((WeatherData) o);
		System.out.println("CurrentConditionsDisplay : t=" + wd.getTemperature() + " p= " + wd.getPressure() + " h="
				+ wd.getHumidity());

	}

}
