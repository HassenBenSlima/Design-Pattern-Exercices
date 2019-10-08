package pizza_store;

import pizza.Pizza;
import pizza_ingredients.PizzaIngredientFactory;
import pizza_ingredients.SfaxPizzaIngredientFactory;
import type_of_pizza.CheesePizza;
import type_of_pizza.ClamPizza;
import type_of_pizza.PepperoniPizza;

public class SfaxPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientfactory = new SfaxPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientfactory);
			pizza.setName("Sfax Style Cheese Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientfactory);
			pizza.setName("Sfax Style Pepperoni Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientfactory);
			pizza.setName("Sfax Style Clam Pizza");
		}
		return pizza;
	}
}

