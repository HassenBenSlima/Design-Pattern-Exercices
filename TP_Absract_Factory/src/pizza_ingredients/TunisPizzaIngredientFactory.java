package pizza_ingredients;

import ingredients.Cheese;
import ingredients.Clam;
import ingredients.Dough;
import ingredients.Sauce;
import ingredients.Veggies;
import type_of_ingredients.Garlic;
import type_of_ingredients.Mozzarella;
import type_of_ingredients.Onion;
import type_of_ingredients.Palourde;
import type_of_ingredients.PlumTomatoSauce;
import type_of_ingredients.Spinach;
import type_of_ingredients.ThinDough;

public class TunisPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThinDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new Mozzarella();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Spinach() };
		return veggies;
	}

	public Clam createClam() {
		return new Palourde();
	}
}