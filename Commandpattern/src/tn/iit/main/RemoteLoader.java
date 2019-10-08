package tn.iit.main;

import tn.iit.command.LightOffCommand;
import tn.iit.command.LightOnCommand;
import tn.iit.control.RemoteControl;
import tn.iit.receiver.Light;

public class RemoteLoader {
	public static void main(String arg[]) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light();
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.onButtonWasPressed(0);
		System.out.println("**************************");
		remoteControl.undoButtonWasPressed();
		
		/*remoteControl.offButtonWasPressed(0);
		Stereo stereo = new Stereo();
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		System.out.println(remoteControl.toString());
		
		remoteControl.onButtonWasPressed(2);*/
	}
}
