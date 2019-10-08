package dec.impl.iit;

public class Berline extends Voiture {

	public Berline(String description, int price) {
		super(description, price);
		// description = "Berline";
	}

	@Override
	public double cost() {
		return this.price;
	}

}
