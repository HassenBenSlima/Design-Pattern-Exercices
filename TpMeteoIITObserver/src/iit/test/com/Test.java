package iit.test.com;

import iit.implimentation.com.CurrentConditionsDisplay;
import iit.implimentation.com.ForecastDisplay;
import iit.implimentation.com.StatisticsDisplay;
import iit.implimentation.com.WeatherData;

public class Test {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();

		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay();
		StatisticsDisplay sd = new StatisticsDisplay();
		ForecastDisplay fd = new ForecastDisplay();
		wd.registerObserver(ccd);
		wd.registerObserver(sd);
		wd.registerObserver(fd);
		wd.mesureChanged(14, 18, 20);
		
	}
}
