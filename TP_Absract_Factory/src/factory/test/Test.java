package factory.test;

import pizza_store.PizzaStore;
import pizza_store.SfaxPizzaStore;
import pizza_store.TunisPizzaStore;

public class Test {
	public static void main(String[] args) {

		PizzaStore pizzaStoreSfax = new SfaxPizzaStore();
		pizzaStoreSfax.orderPizza("cheese");
		System.out.println("---------------");
		PizzaStore pizzaStoreTunis = new TunisPizzaStore();
		pizzaStoreTunis.orderPizza("cheese");

	}
}
