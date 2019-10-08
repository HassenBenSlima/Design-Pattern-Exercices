package cmd.remote;

import cmd.in.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("not programmed yet");

	}

	@Override
	public void undo() {
		System.out.println("not programmed yet");

	}

}
