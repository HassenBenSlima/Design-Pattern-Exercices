
public class AffConditions implements Observer {

	@Override
	public void update(float t, float h, float p) {
		System.out.println("------------------");
		System.out.println("Affichage Condition actuelles");
		System.out.println("------------------");
		System.out.println("Temp=" + t);
		System.out.println("Pression=" + p);
		System.out.println("Himidite=" + h);

	}

}
