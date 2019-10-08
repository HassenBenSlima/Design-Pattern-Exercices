package iit.strategy.behavior;

import flybehavior.FlyNoWay;
import quackbehavior.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("Wooden Duck");
	}

}
