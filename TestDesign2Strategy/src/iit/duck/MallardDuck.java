package iit.duck;

import iit.fly_behavior_interface.FlyWithWings;
import iit.quack_behavior_interface.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Mallard Duck");
	}

}
