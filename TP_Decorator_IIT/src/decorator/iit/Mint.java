package decorator.iit;

import dec.iit.Beverage;

public class Mint extends CondimentDecorator {

	public Mint(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 500;
	}

	@Override
	public String getDescription() {
		return "Mint " + beverage.getDescription();
	}

}
