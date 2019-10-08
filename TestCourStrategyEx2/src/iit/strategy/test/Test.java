package iit.strategy.test;

import iit.strategy.individu.Archer;
import iit.strategy.individu.Individu;
import iit.strategy_impl.ComportementEpee;

public class Test {
	public static void main(String[] args) {

		Individu ind1 = new Archer();

		ind1.display();
		ind1.combattre();
		
		System.out.println("-----------------");
		
		ind1.setComportementArme(new ComportementEpee());
		ind1.display();
		ind1.combattre();
	}

}
