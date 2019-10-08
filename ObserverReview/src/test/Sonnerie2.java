package test;

public class Sonnerie2 implements SonnerieObserver {

	@SuppressWarnings("unused")
	private Chrono chrono;

	public Sonnerie2(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.createSonnorie(this);
	}

	@Override
	public void ding() {
		System.out.println("la la la");

	}

}
