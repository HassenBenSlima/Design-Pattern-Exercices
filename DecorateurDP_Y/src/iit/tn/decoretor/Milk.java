package iit.tn.decoretor;

import iit.tn.beverage.Beverege;

public class Milk extends CondimentDecorator {

	public Milk(Beverege beverege) {
		super("Milk", 300, beverege);
	}
}
