package iit.individu;

import iit.individu_implimentation.CompotementArcEtFleche;

public class Reine extends Individu {

	public Reine() {

		comportementArm = new CompotementArcEtFleche();
	}

	@Override
	public void display() {
		System.out.println("Reine");
	}

}
