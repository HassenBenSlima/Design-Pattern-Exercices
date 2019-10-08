package iit.individu;

import iit.individu_implimentation.ComportementCouteau;

public class Archer extends Individu {

	public Archer() {
		comportementArm = new ComportementCouteau();
	}

	@Override
	public void display() {
		System.out.println("Archer");
	}

}
