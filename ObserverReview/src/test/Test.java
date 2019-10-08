package test;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Chrono chrono = new Chrono();
		SonnerieObserver sonnerie1 = new Sonnerie1(chrono);
		SonnerieObserver sonnerie2 = new Sonnerie2(chrono);

		DisplayObserver display1 = new DisplayNumerique(chrono);
		DisplayObserver display2 = new DisplayAiguille(chrono);

		for (int i =3595; i < 5000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print("erreur");
			}
			chrono.tick((i % 3600) % 60, (int) ((i % 3600) / 60), (int) (i / 3600));
		}
	}
}
