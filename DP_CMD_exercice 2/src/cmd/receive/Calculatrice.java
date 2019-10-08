package cmd.receive;

public class Calculatrice {

	public float plus(float x, float y) {
		System.out.println("plus :"+ (x+y));
		return x + y;
	}

	public float sous(float x, float y) {
		System.out.println("sous :"+ (x-y));
		return x - y;
	}

	public float div(float x, float y) {
		System.out.println("Div : " + (x / y));
		return x / y;

	}

	public float sqrt(float x) {
		System.out.println("sqrt :"+ ((float) Math.sqrt(x)));
		return (float) Math.sqrt(x);
	}

	public float mult(float x, float y) {
		System.out.println("mult : " + (x * y));
		return x * y;
	}

}
