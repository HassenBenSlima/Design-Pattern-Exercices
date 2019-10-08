package iit.implimentation.com;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		WeatherData wd = ((WeatherData) o);
		System.out.println("StatisticsDisplay : t=" + wd.getTemperature() * 2 + " p= " + wd.getPressure() * 2 + " h="
				+ wd.getHumidity() * 2);

	}

}
