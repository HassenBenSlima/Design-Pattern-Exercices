package cmd;

import cmd.in.Command;
import cmd.receive.Calculatrice;

public class MultipCommand implements Command {

	private Calculatrice calculatrice;
	private float x;
	private float y;

	public MultipCommand(Calculatrice calculatrice, float x, float y) {
		super();
		this.calculatrice = calculatrice;
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute() {
		calculatrice.mult(x, y);
	}

}
