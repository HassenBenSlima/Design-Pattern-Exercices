package observer;

public class Test {

	public static void main(String[] args) {
		Product phone = new Product("Banana Phone");

		Person hassen = new Person("hassen");
		Person amina = new Person("amina");
		Person mohamed = new Person("mohamed");
		phone.add(hassen);
		phone.add(amina);
		phone.add(mohamed);
	
		phone.setAvailablity(true);

	}

}
