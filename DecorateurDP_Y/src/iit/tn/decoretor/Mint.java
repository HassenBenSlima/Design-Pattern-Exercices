package iit.tn.decoretor;

import iit.tn.beverage.Beverege;

public class Mint extends CondimentDecorator {
	
	public Mint(Beverege beverege) {
		super("Mint", 200, beverege);
	}
}
