package tn.iit.command;

import tn.iit.receiver.Light;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
		
	}
}
