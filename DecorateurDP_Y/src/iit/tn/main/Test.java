package iit.tn.main;

import iit.tn.beverage.Beverege;
import iit.tn.beverage.Coffee;
import iit.tn.beverage.Tea;
import iit.tn.decoretor.Milk;
import iit.tn.decoretor.Mint;
import iit.tn.decoretor.Pine;
import iit.tn.decoretor.Whip;

public class Test {

	public static void main(String[] args) {

		Beverege b = new Tea();
		b = new Mint(b);
		b = new Pine(b);

		System.out.println(b.getDescription());
		System.out.println(b.cost());

		Beverege c = new Coffee();
		c = new Milk(c);
		c = new Whip(c);

		System.out.println(c.getDescription());
		System.out.println(c.cost());

	}

}
