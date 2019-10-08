package dec.decorator.iit;

import dec.impl.iit.Voiture;

public abstract class Decorator extends Voiture {
	protected Voiture voiture;
	protected double price;

	public Decorator(Voiture voiture, double price) {
		super(voiture.getDescription(),price);
		this.voiture = voiture;
		this.price = price;
	}

	public abstract double cost();

	public abstract String getDescription();
}
