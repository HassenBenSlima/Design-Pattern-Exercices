package iit.quack_behavior_interface;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("MuteQuack");
	}

}
