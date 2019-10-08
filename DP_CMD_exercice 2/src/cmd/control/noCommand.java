package cmd.control;

import cmd.in.Command;

public class noCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No programming yet");
	}

}
