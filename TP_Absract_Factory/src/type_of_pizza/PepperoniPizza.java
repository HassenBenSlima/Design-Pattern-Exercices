package type_of_pizza;

import pizza.Pizza;
import pizza_ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	
	PizzaIngredientFactory ingredientfactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}

	@Override
	public void prepare() {
		System.out.println("Pr�parons " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();

	}

}
