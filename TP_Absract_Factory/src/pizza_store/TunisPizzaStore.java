package pizza_store;

import pizza.Pizza;
import pizza_ingredients.PizzaIngredientFactory;
import pizza_ingredients.TunisPizzaIngredientFactory;
import type_of_pizza.CheesePizza;
import type_of_pizza.ClamPizza;
import type_of_pizza.PepperoniPizza;

public class TunisPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientfactory = new TunisPizzaIngredientFactory();
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientfactory);
			pizza.setName("Tunis Style Cheese Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientfactory);
			pizza.setName("Tunis Style Pepperoni Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientfactory);
			pizza.setName("Tunis Style Clam Pizza");
		}
		return pizza;
	}
}