package cmd.commands;

import cmd.in.Command;
import cmd.receiver.Light;

public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();

	}
}
