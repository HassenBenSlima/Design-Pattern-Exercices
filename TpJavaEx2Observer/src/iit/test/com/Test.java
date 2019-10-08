package iit.test.com;

import iit.display.com.DisplayAiguille;
import iit.display.com.DisplayNumerique;
import iit.implimentation.com.Chrono;
import iit.interf.com.DisplayObserver;
import iit.interf.com.SonnerieObserver;
import iit.sonnorie.com.Sonnerie1;
import iit.sonnorie.com.Sonnerie2;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Chrono chrono = new Chrono();

		SonnerieObserver sonnerie1 = new Sonnerie1(chrono);
		SonnerieObserver sonnerie2 = new Sonnerie2(chrono);

		DisplayObserver display1 = new DisplayNumerique(chrono);
		DisplayObserver display2 = new DisplayAiguille(chrono);

		for (int i = 3595; i < 5000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print("erreur");
			}
			chrono.tick((i % 3600) % 60, (int) ((i % 3600) / 60), (int) (i / 3600));
		}
	}
}
