package metier;

import java.io.File;
import java.util.Scanner;

public class App {

	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) throws Exception {

		Employe e = new Employe("A1", 14000);
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
		
		ICalculIGR mci=(ICalculIGR) c.newInstance();
		e.setMethodeCalculIGR(mci);
		System.out.println("Salaire Net Mensuel:" + e.getSalaireNetMensuel());
		// e.setMethodeCalculIGR(new IGRAlgerie());
		// System.out.println("Salaire Net Mensuel:" + e.getSalaireNetMensuel());

	}

}
