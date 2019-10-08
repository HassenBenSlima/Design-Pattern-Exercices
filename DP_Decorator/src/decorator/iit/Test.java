package decorator.iit;

public class Test {

	public static void main(String[] args) {
		// Sandwich basicSandwich = new BasicSandwich();
		// System.out.println("Description: " + basicSandwich.getDescription());
		// System.out.println("Cost: " + basicSandwich.getCost());

		Sandwich basicSandwich = new Shatta(new Fool(new Salt(new BasicSandwich())));
		System.out.println("Description: " + basicSandwich.getDescription());
		System.out.println("Cost: " + basicSandwich.getCost());
		/**
		 * Car Options System 
		 * Car 
		 * Car Decorator
		 * Options:Navigation system,DVD Player...etc
		 */
	}

}
