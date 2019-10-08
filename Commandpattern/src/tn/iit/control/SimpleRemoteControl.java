package tn.iit.control;

import tn.iit.command.Command;

public class SimpleRemoteControl {
	private Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
