import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo extends Thread implements Observable {

	private float pression;
	private float temperature;
	private float humidite;
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidite, pression);
		}
	}

	public void setMesures(float p, float h, float t) {
		this.temperature = t;
		this.pression = p;
		this.humidite = h;

		notifyObservers();
	}

	@Override
	public void run() {
		while (true) {
			float t = (float) Math.random() * 40;
			float p = 150 + (float) Math.random() * 2000;
			float h = (float) Math.random() * 100;
			setMesures(p, h, t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
