package decorator.iit;

import dec.iit.Beverage;

public class Pine extends CondimentDecorator {

	public Pine(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 800;
	}

	@Override
	public String getDescription() {
		return "Pine " + beverage.getDescription();
	}

}
