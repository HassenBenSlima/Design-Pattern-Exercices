package dec.impl.iit;

public abstract class Voiture {

	protected String description;
	protected double price;

	public Voiture(String description, double price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public abstract double cost();

}
