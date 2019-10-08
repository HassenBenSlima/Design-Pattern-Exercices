package iit.individu.Test;

import iit.individu.Archer;
import iit.individu.Individu;
import iit.individu.Reine;
import iit.individu.chevalier;
import iit.individu_implimentation.ComportementEpee;

public class Test {

	public static void main(String[] args) {
		Individu individu1;
		Individu individu2;
		Individu individu3;

		individu1 = new chevalier();
		individu2 = new Archer();
		individu3 = new Reine();

		System.out.println("------individu1--------");
		individu1.combatre();
		individu1.display();

		System.out.println("-------individu2-------");

		individu2.combatre();
		individu2.display();

		System.out.println("------individu3--------");

		individu3.combatre();
		individu3.display();

		System.out.println("------individu3--------");

		individu3.setComportementArm(new ComportementEpee());
		individu3.combatre();
		individu3.display();

	}
}
