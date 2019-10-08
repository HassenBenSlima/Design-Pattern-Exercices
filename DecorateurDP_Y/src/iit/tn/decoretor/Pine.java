package iit.tn.decoretor;

import iit.tn.beverage.Beverege;

public class Pine extends CondimentDecorator {
	
	public Pine(Beverege beverege) {
		super("Pine", 800, beverege);
	}
}
