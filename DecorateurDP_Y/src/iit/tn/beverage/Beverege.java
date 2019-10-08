package iit.tn.beverage;

public abstract class Beverege {
	protected String description;
	protected float price;

	public Beverege(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	public float cost() {
		return price;
	}

	public String getDescription() {
		return description;
	}

}
