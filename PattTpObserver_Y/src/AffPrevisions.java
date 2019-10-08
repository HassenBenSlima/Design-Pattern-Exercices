
public class AffPrevisions implements Observer {
	private float pression;

	@Override
	public void update(float t, float h, float p) {
		System.out.println("-----------------------");
		System.out.println("Affichage de previsions");
		if ((p - pression) > 0) {
			System.out.println("Amelioration en cours");
		} else if ((p - pression) < 0) {
			System.out.println("Le temps se raffraichit");
		} else {
			System.out.println("Dépression bien installée");
		}

		pression = p;
	}

}
