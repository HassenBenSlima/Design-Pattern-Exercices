package iit.duck.test;

import iit.duck.Duck;
import iit.duck.MallardDuck;
import iit.duck.WoodenDuck;
import iit.quack_behavior_interface.Squeak;

public class Test {

	public static void main(String[] args) {
		Duck duck1;
		Duck duck2;

		duck1 = new MallardDuck();
		duck2 = new WoodenDuck();
		System.out.println("------duck1-------");
		duck1.display();
		duck1.performQuack();
		duck1.performFly();
		System.out.println("------duck2-------");

		duck2.display();
		duck2.performQuack();
		duck2.performFly();
		System.out.println("-------duck2-------");

		duck2.setQuackBehavior(new Squeak());
		duck2.display();
		duck2.performQuack();
		duck2.performFly();

	}
}
