package dec.iit;

public class Tea extends Beverage {

	public Tea() {
		description = "Tea";
	}

	@Override
	public double cost() {
		return 150;
	}

}
