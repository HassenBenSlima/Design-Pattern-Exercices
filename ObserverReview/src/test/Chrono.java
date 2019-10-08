package test;

import java.util.ArrayList;
import java.util.List;

public class Chrono implements Subject {

	private int secondes;
	private int minutes;
	private int heures;

	List<DisplayObserver> displayObservers = new ArrayList<DisplayObserver>();
	List<SonnerieObserver> sonnerieObservers = new ArrayList<SonnerieObserver>();

	public int getSecondes() {
		return secondes;
	}

	public void setSecondes(int secondes) {
		this.secondes = secondes;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	public List<DisplayObserver> getDisplayObservers() {
		return displayObservers;
	}

	public void setDisplayObservers(List<DisplayObserver> displayObservers) {
		this.displayObservers = displayObservers;
	}

	public List<SonnerieObserver> getSonnerieObservers() {
		return sonnerieObservers;
	}

	public void setSonnerieObservers(List<SonnerieObserver> sonnerieObservers) {
		this.sonnerieObservers = sonnerieObservers;
	}

	public void tick(int s, int m, int h) {

		if (this.heures != h) {
			notifierAllSonnorie();
		}

		this.setSecondes(s);
		this.setMinutes(m);
		this.setHeures(h);

		// System.out.println("Second :" + secondes + "Minutes :" + minutes + "Heures :"
		// + heures);
		notifierAllDisplay();

	}

	@Override
	public void createSonnorie(SonnerieObserver s) {

		sonnerieObservers.add(s);
	}

	@Override
	public void removeSonnorie(SonnerieObserver s) {
		sonnerieObservers.remove(s);
	}

	@Override
	public void notifierAllSonnorie() {
		for (SonnerieObserver s : sonnerieObservers) {
			s.ding();
		}
	}

	@Override
	public void createDisplay(DisplayObserver d) {
		displayObservers.add(d);
	}

	@Override
	public void removeDisplay(DisplayObserver d) {
		displayObservers.remove(d);
	}

	@Override
	public void notifierAllDisplay() {
		for (DisplayObserver d : displayObservers) {
			d.afficheTempsEcoule();
		}
	}

}
