package iit.implimentation.com;
import iit.interfaces.com.Observer;

public class CurrentConditionsDisplay implements Observer {

	@Override
	public void update(float t, float p, float h) {

		System.out.println("CurentConditionDisplay : t=" + t + " p=" + p + " h=" + h);
	}

}
