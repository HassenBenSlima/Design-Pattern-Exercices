package dec.decorator.iit;

import dec.impl.iit.Voiture;

public class VitreElectrique extends Decorator {

	public VitreElectrique(Voiture voiture, int price) {
		super(voiture, price);
	}

	@Override
	public double cost() {
		return voiture.cost() + 100;
	}

	@Override
	public String getDescription() {
		return   voiture.getDescription()+" VitreElectrique ";
	}

}
