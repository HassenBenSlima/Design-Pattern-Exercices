package cmd.commands;

import cmd.in.Command;
import cmd.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

	@Override
	public void undo() {
		garageDoor.down();
		garageDoor.lightOff();

	}
}