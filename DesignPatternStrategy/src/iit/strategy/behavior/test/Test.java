package iit.strategy.behavior.test;

import flybehavior.FlyRockPowred;
import iit.strategy.behavior.Duck;
import iit.strategy.behavior.MallardDuck;
import iit.strategy.behavior.WoodenDuck;
import quackbehavior.Squeak;

public class Test {

	public static void main(String[] args) {
		Duck duck1;
		Duck duck2;

		duck1 = new MallardDuck();
		duck2 = new WoodenDuck();

		duck1.display();
		duck1.performFly();
		duck1.performQuack();

		System.out.println("-----------------");

		duck2.display();
		duck2.performFly();
		duck2.performQuack();

		System.out.println("-----------------");

		duck2.setFlyBehavior(new FlyRockPowred());
		duck2.performFly();
		duck2.setQuackBehavior(new Squeak());
		duck2.performQuack();

	}
}
