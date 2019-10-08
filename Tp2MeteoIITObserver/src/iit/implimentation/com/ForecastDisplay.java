package iit.implimentation.com;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData wd = ((WeatherData) o);
		System.out.println("ForecastDisplay : t=" + wd.getTemperature() * 3 + " p= " + wd.getPressure() * 3 + " h="
				+ wd.getHumidity() * 3);

	}

}
