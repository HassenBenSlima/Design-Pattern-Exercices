package iit.chocolat;

public class Test {

	public static void main(String[] args) {

		ChocolateBoite c1 = ChocolateBoite.getChocolateBoite();

		ChocolateBoite c2 = ChocolateBoite.getChocolateBoite();

//		c1.fill();
//		c1.drain();
//		c1.boil();
//
//		c2.fill();
//		c2.drain();
//		c2.boil();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c1.fill();
				c1.drain();
				c1.boil();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				c2.fill();
				c2.drain();
				c2.boil();

			}
		});
		
		t1.start();
		t2.start();

		System.out.println(c1);
		System.out.println(c2);
	}
}



