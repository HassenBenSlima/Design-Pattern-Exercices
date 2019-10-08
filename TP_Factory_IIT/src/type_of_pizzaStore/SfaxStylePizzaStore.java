package type_of_pizzaStore;

import pizza.Pizza;
import pizzaStore.PizzaStore;
import typeofpizza.SfaxStyleCheesePizza;
import typeofpizza.SfaxStyleClamPizza;
import typeofpizza.SfaxStylePepperoniPizza;

public class SfaxStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new SfaxStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new SfaxStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new SfaxStyleClamPizza();
		}
		
		return pizza;
	}

}
