package decorateur;

import dec.Boisson;

public class Lait extends DecorateurBoisson {

	public Lait(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		return boisson.cout() + 2;
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au lait";
	}

}
