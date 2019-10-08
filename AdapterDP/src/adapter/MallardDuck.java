package adapter;

public class MallardDuck implements Duck {

	public MallardDuck() {
		super();
		System.out.println("*****MallardDuck*****");
	}

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("Fly");
	}
}