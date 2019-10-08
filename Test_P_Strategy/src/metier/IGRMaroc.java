package metier;

public class IGRMaroc implements ICalculIGR {

	public IGRMaroc() {
	}

	@Override
	public float calculerIGR(float sba) {
		if (sba < 40000) {
			return 5 * sba / 100;
		} else if (sba < 120000) {
			return sba * 20 / 100;
		} else {
			return sba * 42 / 100;
		}

	}

}
