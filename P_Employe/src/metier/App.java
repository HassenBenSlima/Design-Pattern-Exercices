/**
 * 
 */
package metier;

import java.io.File;
import java.util.Scanner;

/**
 * @author Hassen Ben Slima
 *
 */
public class App {

	/**
	 * @param args
	 * @throws Exception
	 *             if we want to change the behavior everytime we use the famous
	 *             design pattern strategy, it's very felxible if we have a only
	 *             behavior we use class abstract <Method Pattern>
	 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("config.txt"));
		String nomClasse = sc.next();
		/*
		 * pour l'instancié forname permet de charger une classe dinamiquement en
		 * memoire
		 */
		Class c = Class.forName(nomClasse);
		/*
		 * pour creeun objet de cette classe on utilise new instance
		 */
		Employe e = (Employe) c.newInstance();
		e.setSalaireBrurMensuel(14000);
		System.out.println(e.getSalaireNetMensuel());

		// Employe e = new EmployeAlgeire("A1", 14000);
		// System.out.println(e.getSalaireNetMensuel());
		// e = new EmployeMaroc("A2", 14000);
		// System.out.println(e.getSalaireNetMensuel());
	}

}
