package decorateur;

import dec.Boisson;

public class Sucre extends DecorateurBoisson {

	public Sucre(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au sucr�";
	}

	@Override
	public double cout() {
		return boisson.cout() + 20;
	}

}
