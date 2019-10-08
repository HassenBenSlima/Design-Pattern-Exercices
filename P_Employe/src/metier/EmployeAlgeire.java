package metier;

public class EmployeAlgeire extends Employe {

	public EmployeAlgeire() {
		super();
	}

	public EmployeAlgeire(String cin, float salaireBrurMensuel) {
		super(cin, salaireBrurMensuel);
	}

	@Override
	public float calculerIGR() {
		float sba = salaireBrurMensuel * 12;
		return sba * 35 / 100;
	}

}
