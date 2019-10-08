package decorator.iit;

import dec.iit.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 400;
	}

	@Override
	public String getDescription() {
		return "Whip " + beverage.getDescription();
	}

}
