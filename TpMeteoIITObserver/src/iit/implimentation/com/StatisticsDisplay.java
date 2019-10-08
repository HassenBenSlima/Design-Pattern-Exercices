package iit.implimentation.com;
import iit.interfaces.com.Observer;

public class StatisticsDisplay implements Observer {
	
	

	@Override
	public void update(float t, float p, float h) {
		System.out.println("StatisticsDisplay : t=" + t * 2 + " p=" + p * 2 + " h=" + h * 2);

	}

}
