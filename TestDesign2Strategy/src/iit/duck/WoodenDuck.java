package iit.duck;

import iit.fly_behavior_interface.FlyNoWay;
import iit.quack_behavior_interface.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	

	@Override
	public void display() {
		System.out.println("Wooden Duck");
	}

}
