package dec.decorator.iit;

import dec.impl.iit.Voiture;

public class ABS extends Decorator {

	public ABS(Voiture voiture, int prix) {
		super(voiture, prix);
	}

	@Override
	public double cost() {
		return voiture.cost() + 500;
	}

	@Override
	public String getDescription() {
		return  voiture.getDescription()+" ABS ";
	}

}
