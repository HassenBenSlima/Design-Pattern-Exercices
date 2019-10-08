package metier;

public class Employe {
	private String cin;
	private float salaireBrurMensuel;
	private ICalculIGR methodeCalculIGR;

	public Employe(String cin, float salaireBrurMensuel) {
		super();
		this.cin = cin;
		this.salaireBrurMensuel = salaireBrurMensuel;
	}

	public float calculerIGR() {

		return methodeCalculIGR.calculerIGR(salaireBrurMensuel * 12);
	}

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

	public void setMethodeCalculIGR(ICalculIGR methodeCalculIGR) {
		this.methodeCalculIGR = methodeCalculIGR;
	}

}
