package test;

public class DisplayAiguille implements DisplayObserver {

	private Chrono chrono;

	public DisplayAiguille(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.createDisplay(this);
	}

	@Override
	public void afficheTempsEcoule() {
		System.out.println("second :" + chrono.getSecondes() + " munite :" + chrono.getMinutes() + "heure :" + chrono.getHeures());
	}

}
