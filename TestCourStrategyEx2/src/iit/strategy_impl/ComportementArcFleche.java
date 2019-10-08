package iit.strategy_impl;

import iit.strategy_interface.ComportementArme;

public class ComportementArcFleche implements ComportementArme {

	@Override
	public void utiliseArme() {
		System.out.println("Comportement Arc Fleche");
	}

}
