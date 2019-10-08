package dec.decorator.iit;

import dec.impl.iit.Voiture;

public class AirBag extends Decorator {

	public AirBag(Voiture voiture, int numero) {
		super(voiture, numero);
	}

	@Override
	public double cost() {
		return voiture.cost() + 200;
	}

	@Override
	public String getDescription() {
		return   voiture.getDescription()+" AirBag ";
	}

}
