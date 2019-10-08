package cmd.commands;

import cmd.in.Command;
import cmd.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
		
	}

}
