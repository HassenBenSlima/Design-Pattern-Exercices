package type_of_pizzaStore;

import pizza.Pizza;
import pizzaStore.PizzaStore;
import typeofpizza.TunisStyleCheesePizza;
import typeofpizza.TunisStyleClamPizza;
import typeofpizza.TunisStylePepperoniPizza;

public class TunisStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new TunisStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new TunisStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new TunisStyleClamPizza();
		}
		return pizza;
	}

}
