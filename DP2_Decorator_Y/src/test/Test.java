package test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

import dec.Boisson;
import dec.Espresso;
import decorateur.Chocolat;
import decorateur.Lait;
import decorateur.Sucre;

public class Test {
	public static void main(String[] args) {

		Boisson b;

		b = new Espresso();

		System.out.println(b.getDescription());
		System.out.println(b.cout());

		b = new Lait(b);

		System.out.println(b.getDescription());
		System.out.println(b.cout());

		b = new Chocolat(b);

		System.out.println(b.getDescription());
		System.out.println(b.cout());

		b = new Chocolat(b);

		System.out.println(b.getDescription());
		System.out.println(b.cout());

		System.out.println("---------------------");
		Boisson b2 = new Sucre(new Chocolat(new Lait(new Chocolat(new Espresso()))));

		System.out.println(b2.getDescription());
		System.out.println(b2.cout());
		// b = new Deca();
		// System.out.println(b.getDescription());
		// System.out.println(b.cout());

		System.out.println("---------------------");
//
//		try {
//			ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("fichier.zip")));
//			zos.write(new byte[] { 70, 80, 57, 23, 56 });
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
