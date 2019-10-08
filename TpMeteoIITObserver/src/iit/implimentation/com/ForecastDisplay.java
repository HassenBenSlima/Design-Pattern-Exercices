package iit.implimentation.com;
import iit.interfaces.com.Observer;

public class ForecastDisplay implements Observer {

	@Override
	public void update(float t, float p, float h) {
		System.out.println("ForecastDisplay : t=" + t * 3 + " p= " + p * 3 + " h=" + h * 3);

	}

}
