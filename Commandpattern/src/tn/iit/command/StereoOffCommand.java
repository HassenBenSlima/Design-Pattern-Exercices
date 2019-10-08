package tn.iit.command;

import tn.iit.receiver.Stereo;

public class StereoOffCommand implements Command{
	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
		
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
		
	}
	
	

}
