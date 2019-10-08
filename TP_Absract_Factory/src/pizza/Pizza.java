package pizza;

import ingredients.Cheese;
import ingredients.Clam;
import ingredients.Dough;
import ingredients.Sauce;
import ingredients.Veggies;

public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	public Cheese cheese;
	public Veggies veggies[];
	public Clam clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Cuire durant 25mn à 350°");
	}

	public void cut() {
		System.out.println("Couper en morceaux à la diagonale");
	}

	public void box() {
		System.out.println("Placer la pizza dans un boitier officiel");
	}

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}
}
