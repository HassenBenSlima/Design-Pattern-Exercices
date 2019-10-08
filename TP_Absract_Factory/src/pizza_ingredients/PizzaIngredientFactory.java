package pizza_ingredients;

import ingredients.Cheese;
import ingredients.Clam;
import ingredients.Dough;
import ingredients.Sauce;
import ingredients.Veggies;

public interface PizzaIngredientFactory {

	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Clam createClam();
}
