package iit.strategy.individu;

import iit.strategy.individu.Individu;
import iit.strategy_impl.ComportementEpee;

public class Chevalier extends Individu {

	 public Chevalier() {
		comportementArme = new ComportementEpee();
	}

	@Override
	public void display() {
		System.out.println("chevalier");
	}

}
