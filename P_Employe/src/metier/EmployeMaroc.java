package metier;

public class EmployeMaroc extends Employe {

	public EmployeMaroc() {
		super();
	}

	public EmployeMaroc(String cin, float salaireBrurMensuel) {
		super(cin, salaireBrurMensuel);
	}

	@Override
	public float calculerIGR() {
		float sba = salaireBrurMensuel * 12;
		if (sba < 40000) {
			return 5 * sba / 100;
		} else if (sba < 120000) {
			return sba * 20 / 100;
		} else {
			return sba * 42 / 100;
		}
	}

}
