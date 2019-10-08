package pizza_ingredients;

import ingredients.Cheese;
import ingredients.Clam;
import ingredients.Dough;
import ingredients.Sauce;
import ingredients.Veggies;
import type_of_ingredients.Clovis;
import type_of_ingredients.EggPlant;
import type_of_ingredients.Garlic;
import type_of_ingredients.MarinaraSauce;
import type_of_ingredients.Parmesan;
import type_of_ingredients.ThinDough;

public class SfaxPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new Parmesan();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new EggPlant() };
		return veggies;
	}

	public Clam createClam() {
		return new Clovis();
	}
}
