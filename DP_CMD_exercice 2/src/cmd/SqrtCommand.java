package cmd;

import cmd.in.Command;
import cmd.receive.Calculatrice;

public class SqrtCommand implements Command {

	private Calculatrice calculatrice;
	private float x;

	public SqrtCommand(Calculatrice calculatrice, float x) {
		super();
		this.calculatrice = calculatrice;
		this.x = x;
	}

	@Override
	public void execute() {
		calculatrice.sqrt(x);
	}

}
