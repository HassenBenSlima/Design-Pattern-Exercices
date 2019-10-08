package pizza_store;

import pizza.Pizza;

public abstract class PizzaStore {

	public abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		/* in the bottom: the same methods for all pizza */
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
