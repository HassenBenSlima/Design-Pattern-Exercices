package iit.sonnorie.com;

import iit.implimentation.com.Chrono;
import iit.interf.com.SonnerieObserver;

public class Sonnerie2 implements SonnerieObserver {
	@SuppressWarnings("unused")
	private Chrono chrono;

	public Sonnerie2(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerObserverSonnerie(this);
	}

	@Override
	public void ding() {
		System.out.println("Sonnerie2: LALALALALALALALALA");
	}

}
