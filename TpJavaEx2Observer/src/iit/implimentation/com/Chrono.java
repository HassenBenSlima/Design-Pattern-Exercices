package iit.implimentation.com;

import java.util.ArrayList;
import java.util.List;

import iit.interf.com.DisplayObserver;
import iit.interf.com.SonnerieObserver;
import iit.interf.com.Subject;

public class Chrono implements Subject {

	private int seconds;
	private int munites;
	private int heures;

	private List<SonnerieObserver> observerSonnerie = new ArrayList<>();
	private List<DisplayObserver> observerDisplay = new ArrayList<>();

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMunites() {
		return munites;
	}

	public void setMunites(int munites) {
		this.munites = munites;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	@Override
	public void registerObserverSonnerie(SonnerieObserver s) {
		observerSonnerie.add(s);
	}

	@Override
	public void removeObserverSonnerie(SonnerieObserver s) {
		observerSonnerie.remove(s);
	}

	@Override
	public void notifyObserverSonnerie() {
		for (SonnerieObserver s : observerSonnerie) {
			s.ding();
		}
	}

	@Override
	public void registerObserverDisplay(DisplayObserver o) {
		observerDisplay.add(o);

	}

	@Override
	public void removeObserverDisplay(DisplayObserver o) {
		observerDisplay.remove(o);
	}

	@Override
	public void notifyObserverDisplay() {
		for (DisplayObserver o : observerDisplay) {
			o.afficheTempsEcoule();
		}
	}

	public void tick(int s, int m, int h) {
		if (this.heures != h) {
			notifyObserverSonnerie();
		}
		this.seconds = s;
		this.munites = m;
		this.heures = h;
		System.out.println("second:" + seconds + " munite:" + munites + " h:" + heures);
		notifyObserverDisplay();

	}

}
