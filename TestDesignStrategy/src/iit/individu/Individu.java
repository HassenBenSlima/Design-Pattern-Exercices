package iit.individu;

import iit.individu_interface.ComportementArm;

public abstract class Individu {

	protected ComportementArm comportementArm;

	public void combatre() {
		comportementArm.utiliseArm();
	}

	public abstract void display();

	public ComportementArm getComportementArm() {
		return comportementArm;
	}

	public void setComportementArm(ComportementArm comportementArm) {
		this.comportementArm = comportementArm;
	}

}
