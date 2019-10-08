package test.pizza;

import pizzaStore.PizzaStore;
import type_of_pizzaStore.SfaxStylePizzaStore;
import type_of_pizzaStore.TunisStylePizzaStore;

public class Test {

	public static void main(String[] args) {

		PizzaStore pizzaStoreSfax = new SfaxStylePizzaStore();
		pizzaStoreSfax.orderPizza("cheese");

		PizzaStore pizzaStoreTunis = new TunisStylePizzaStore();
		pizzaStoreTunis.orderPizza("cheese");

	}
}
