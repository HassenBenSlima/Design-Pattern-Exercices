
public class Application {

	public static void main(String[] args) {
		DonneesMeteo dm = new DonneesMeteo();
		Observer o1 = new AffConditions();
		dm.addObserver(o1);
		Observer o2 = new AffPrevisions();
		dm.addObserver(o2);

		dm.start();
	}
}
