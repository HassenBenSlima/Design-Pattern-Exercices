package decorator.iit;

import dec.iit.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	public abstract double cost();

	public abstract String getDescription();

}
