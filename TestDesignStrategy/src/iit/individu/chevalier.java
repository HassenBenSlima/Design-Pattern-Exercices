package iit.individu;

import iit.individu_implimentation.ComportementEpee;

public class chevalier extends Individu {

	
	public chevalier() {
		comportementArm = new ComportementEpee();
	}
	
	
	@Override
	public void display() {
		System.out.println("chevalier");
	}

}
