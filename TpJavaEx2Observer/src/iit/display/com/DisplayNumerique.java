package iit.display.com;

import iit.implimentation.com.Chrono;
import iit.interf.com.DisplayObserver;

public class DisplayNumerique implements DisplayObserver {
	private Chrono chrono;

	public DisplayNumerique(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerObserverDisplay(this);
	}

	@Override
	public void afficheTempsEcoule() {
		System.out.println(
				"DisplayNumerique: s=" + chrono.getSeconds() + "m=" + chrono.getMunites() + "h=" + chrono.getHeures());

	}

}
