package dec.iit;

public class Coffee extends Beverage {
	public Coffee() {
		description = "Coffee";
	}

	@Override
	public double cost() {
		return 200;
	}

}
