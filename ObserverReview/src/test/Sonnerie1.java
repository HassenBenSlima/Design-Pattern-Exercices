package test;

public class Sonnerie1 implements SonnerieObserver {

	@SuppressWarnings("unused")
	private Chrono chrono;

	public Sonnerie1(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.createSonnorie(this);
	}
	//

	@Override
	public void ding() {
		System.out.println("lo lo lo");
	}

}
