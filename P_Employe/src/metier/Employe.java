package metier;

public abstract class Employe {
	private String cin;
	protected float salaireBrurMensuel;

	public Employe(String cin, float salaireBrurMensuel) {
		super();
		this.cin = cin;
		this.salaireBrurMensuel = salaireBrurMensuel;
	}

	public Employe() {
		super();
	}

	public abstract float calculerIGR();

	public float getSalaireNetMensuel() {
		float igr = calculerIGR();
		float sNA = salaireBrurMensuel * 12 - igr;
		return sNA / 12;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public float getSalaireBrurMensuel() {
		return salaireBrurMensuel;
	}

	public void setSalaireBrurMensuel(float salaireBrurMensuel) {
		this.salaireBrurMensuel = salaireBrurMensuel;
	}

}
