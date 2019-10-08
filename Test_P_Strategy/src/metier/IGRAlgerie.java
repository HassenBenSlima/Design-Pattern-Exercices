package metier;

public class IGRAlgerie implements ICalculIGR {

	@Override
	public float calculerIGR(float sba) {

		return sba*35/100;
	}

}
