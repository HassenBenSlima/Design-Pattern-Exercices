package cmd;

import cmd.in.Command;
import cmd.receive.Calculatrice;

public class PlusCommand implements Command {

	private Calculatrice calculatrice;
	private float x;
	private float y;

	public PlusCommand(Calculatrice calculatrice, float x, float y) {
		super();
		this.calculatrice = calculatrice;
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute() {
		calculatrice.plus(x, y);
	}

}
