package iit.strategy.individu;

import iit.strategy_interface.ComportementArme;

public abstract class Individu {

	protected ComportementArme comportementArme;

	public void combattre() {
		comportementArme.utiliseArme();
	}

	public abstract void display();

	public ComportementArme getComportementArme() {
		return comportementArme;
	}

	public void setComportementArme(ComportementArme ComportementArme) {
		this.comportementArme = ComportementArme;
	}

	

	
}
