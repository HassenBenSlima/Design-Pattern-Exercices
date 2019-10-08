package decorator.iit;

public class Shatta extends SandwichDecorator {

	public Shatta(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.8;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Shatta";
	}

}
