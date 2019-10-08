package iit.tn.decoretor;

import iit.tn.beverage.Beverege;

public abstract class CondimentDecorator extends Beverege {

	protected Beverege beverege;

	public CondimentDecorator(String description, float price, Beverege beverege) {
		super(description, price);
		this.beverege = beverege;
	}
	@Override
	public float cost() {
		return this.price + beverege.cost();
	}
	@Override
	public String getDescription() {
		return beverege.getDescription()  + " with " + this.description;
	}
}
