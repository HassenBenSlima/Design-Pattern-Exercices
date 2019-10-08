package iit.sonnorie.com;

import iit.implimentation.com.Chrono;
import iit.interf.com.SonnerieObserver;

public class Sonnerie1 implements SonnerieObserver {
	@SuppressWarnings("unused")
	private Chrono chrono;

	public Sonnerie1(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerObserverSonnerie(this);
		
	}

	@Override
	public void ding() {
		System.out.println("Sonnerie1: TI RI RI RI RI RI RA");

	}
}
