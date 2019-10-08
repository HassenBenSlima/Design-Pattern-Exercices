package iit.strategy_impl;

import iit.strategy_interface.ComportementArme;

public class ComportementEpee implements ComportementArme {

	@Override
	public void utiliseArme() {
		System.out.println("Comportement Epee");
	}

}
