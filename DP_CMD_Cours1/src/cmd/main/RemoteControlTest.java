package cmd.main;

import cmd.commands.GarageDoorOpenCommand;
import cmd.commands.LightOnCommand;
import cmd.commands.StereoOnWithCDCommand;
import cmd.in.Command;
import cmd.receiver.GarageDoor;
import cmd.receiver.Light;
import cmd.receiver.Stereo;
import cmd.remote.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String argv[]) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		Stereo stereo = new Stereo();
		Command cmdSterio = new StereoOnWithCDCommand(stereo);

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(lightOn); // encapsuler la commande
		remote.buttonWasPressed(); // allumer la lumière
		System.out.println("----------------");
		remote.setCommand(garageOpen); // encapsuler la commande
		remote.buttonWasPressed(); // ouvrir la porte du garage
		

		System.out.println("----------------");
		remote.setCommand(cmdSterio); // encapsuler la commande
		remote.buttonWasPressed(); // ouvrir la porte du garage

	}
}
