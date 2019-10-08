package iit.strategy.individu;

import iit.strategy.individu.Individu;
import iit.strategy_impl.ComportementArcFleche;

public class Archer extends Individu {

	public Archer() {
		comportementArme = new  ComportementArcFleche();
	}
	


	@Override
	public void display() {
		System.out.println("archer");
	}

}
