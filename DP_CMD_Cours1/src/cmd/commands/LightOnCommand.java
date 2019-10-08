package cmd.commands;

import cmd.in.Command;
import cmd.receiver.Light;

public class LightOnCommand implements Command {
	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}
}