package iit.tn.decoretor;

import iit.tn.beverage.Beverege;

public class Whip extends CondimentDecorator {

	public Whip(Beverege beverege) {
		super("Whip", 250, beverege);
	}
}
