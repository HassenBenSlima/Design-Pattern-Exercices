package type_of_pizza;

import pizza.Pizza;
import pizza_ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientfactory;

	public ClamPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	public void prepare() {
		System.out.println("Préparons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		clam = ingredientfactory.createClam();
	}
}