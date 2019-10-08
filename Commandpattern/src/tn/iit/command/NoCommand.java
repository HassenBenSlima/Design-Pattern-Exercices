package tn.iit.command;

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
