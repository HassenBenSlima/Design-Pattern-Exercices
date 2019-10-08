package dec.test.iit;

import dec.decorator.iit.ABS;
import dec.decorator.iit.AirBag;
import dec.decorator.iit.VitreElectrique;
import dec.impl.iit.Berline;
import dec.impl.iit.Camionnette;
import dec.impl.iit.Voiture;

public class Test {

	public static void main(String[] args) {
		Voiture v1 = new Camionnette("P404", 10000);
		Voiture v2 = new Berline("P407", 20000);
		
		v1 = new ABS(v1, 800);// 800 représente le prix de l’option ABS
		v2 = new VitreElectrique(v2, 1000); // 1000 représente le prix de l’option
		v2 = new AirBag(v2, 1200); // 1200 représente le prix de l’option
		
		System.out.println("La voiture est une " + v1.getDescription());
		// affiche: La voiture est une P404 avec ABS
		System.out.println("Son prix est:" + v1.cost());
		// affiche: Son prix est 10800
		System.out.println("La voiture est une " + v2.getDescription());
		// affiche: La voiture est une P407 avec VitreElectrique, AirBag
		System.out.println("Son prix est:" + v2.cost());
		// affiche: Son prix est 22200
	}
}