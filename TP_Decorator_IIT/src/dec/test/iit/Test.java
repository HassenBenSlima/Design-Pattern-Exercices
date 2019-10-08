package dec.test.iit;

import dec.iit.Beverage;
import dec.iit.Coffee;
import decorator.iit.Milk;

public class Test {

	public static void main(String[] args) {
		Beverage b;
		b = new Coffee();
		// System.out.println(b.getDescription());

		b = new Milk(b);
		System.out.println(b.cost());
		System.out.println(b.getDescription());

	}
}
