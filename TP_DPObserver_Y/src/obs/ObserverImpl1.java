package obs;

public class ObserverImpl1 implements Observer {

	@Override
	public void update(int v) {
		System.out.println("Observateur 1");
		/*
		 * on doir recuperer l'etat
		 */

		// int etat = ((ObservableConcret) o).getEtat();
		System.out.println("Resultat :" + v * 3);

	}

}
