package iit.chocolat;

public class ChocolateBoite {

	private static ChocolateBoite chocolateBoite = new ChocolateBoite();
	private boolean empty;
	private boolean boiled;

	private ChocolateBoite() {
		empty = true;
		boiled = false;
	}

	 public static ChocolateBoite getChocolateBoite() {
		// if (chocolateBoite == null) {
		// chocolateBoite = new ChocolateBoite();
		// }
	 return chocolateBoite;
	 }

	public void fill() {
		if (empty) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!empty && boiled) {
			empty = true;
		}
	}

	public void boil() {
		if (!empty && !boiled) {
			boiled = true;
		}
	}

}
