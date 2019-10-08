package tn.iit.command;

import tn.iit.receiver.Stereo;

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
