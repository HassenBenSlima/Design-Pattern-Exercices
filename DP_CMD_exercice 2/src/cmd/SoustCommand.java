package cmd;

import cmd.in.Command;
import cmd.receive.Calculatrice;

public class SoustCommand implements Command {

	private Calculatrice calculatrice;
	private float x;
	private float y;

	public SoustCommand(Calculatrice calculatrice, float x, float y) {
		super();
		this.calculatrice = calculatrice;
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute() {
		calculatrice.sous(x, y);
	}

}
