package decorator.iit;

import dec.iit.Beverage;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 600;
	}

	@Override
	public String getDescription() {
		return "Milk " + beverage.getDescription();
	}

}
