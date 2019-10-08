package dec.impl.iit;

public class Camionnette extends Voiture {

	public Camionnette(String description, double price) {
		// description = "Camionnette";
		super(description,price);
	}

	@Override
	public double cost() {
		return this.price;
	}

}
