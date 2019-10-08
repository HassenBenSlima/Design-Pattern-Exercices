package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private int etat;

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(etat);
		}
	}

	public void setEtat(int etat) {
		this.etat = etat;
		/*
		 * a chaque fois on change l'etat on fait une notification
		 */
		notifyObservers();
	}

	public int getEtat() {
		return etat;
	}

}
