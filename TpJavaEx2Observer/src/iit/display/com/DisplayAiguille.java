package iit.display.com;

import iit.implimentation.com.Chrono;
import iit.interf.com.DisplayObserver;

public class DisplayAiguille implements DisplayObserver {
	private Chrono chrono;

	public DisplayAiguille(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerObserverDisplay(this);
	}

	@Override
	public void afficheTempsEcoule() {
		System.out.println(
				"DisplayAiguille: s=" + chrono.getSeconds() + "m=" + chrono.getMunites() + "h=" + chrono.getHeures());
	}

}
