package iit.strategy.individu;

import iit.strategy.individu.Individu;
import iit.strategy_impl.ComportementCouteau;

public class Reine extends Individu {

	public Reine() {
		comportementArme = new ComportementCouteau();
	}

	@Override
	public void display() {
		System.out.println("reine");
	}

}
