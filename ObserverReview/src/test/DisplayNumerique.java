package test;

public class DisplayNumerique implements DisplayObserver {

	private Chrono chrono;

	public DisplayNumerique(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.createDisplay(this);
	}

	@Override
	public void afficheTempsEcoule() {
		System.out.println("second :" + chrono.getSecondes() + " munite :" + chrono.getMinutes() + "heure :" + chrono.getHeures());
	}

}
