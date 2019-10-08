package cmd.main;

import cmd.commands.LightOffCommand;
import cmd.commands.LightOnCommand;
import cmd.commands.StereoOffCommand;
import cmd.commands.StereoOnWithCDCommand;
import cmd.receiver.Light;
import cmd.receiver.Stereo;
import cmd.remote.RemoteControl;

class RemoteLoader {
	public static void main(String arg[]) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light();
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		System.out.println("-----------Light  on---------");

		remoteControl.onButtonWasPressed(0);
		System.out.println("-----------Light  off---------");

		remoteControl.offButtonWasPressed(0);

		System.out.println("**************************");

		Stereo stereo = new Stereo();
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

		remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
		System.out.println("-----------stereoOnWithCommand---------");
		remoteControl.onButtonWasPressed(1);

		System.out.println("-----------stereoOnWithCDCommand Undo---------");
		remoteControl.undoButtonWasPressed();

		
		System.out.println("-----------stereo Off---------");

		remoteControl.offButtonWasPressed(1);

		System.out.println("-----------stereo Undo---------");
		remoteControl.undoButtonWasPressed();

		System.out.println("**************************");

		System.out.println(remoteControl.toString());
	}
}