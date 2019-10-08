package tn.iit.main;

import tn.iit.command.GarageDoorOpenCommand;
import tn.iit.command.LightOffCommand;
import tn.iit.command.LightOnCommand;
import tn.iit.control.SimpleRemoteControl;
import tn.iit.receiver.GarageDoor;
import tn.iit.receiver.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light=new Light();
		LightOnCommand lightOn=new LightOnCommand (light);
		LightOffCommand lightOff=new LightOffCommand (light);
		remote.setCommand(lightOn); //passer la commande à l’invoker
		remote.buttonWasPressed(); //simuler l’appui sur le bouton
		
		//***
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new
		GarageDoorOpenCommand(garageDoor);
		
		
		
		remote.setCommand(lightOff); //passer la commande à l’invoker
		remote.buttonWasPressed(); 
		System.out.println("*****************");
		remote.setCommand(garageOpen); //encapsuler la commande
		remote.buttonWasPressed(); //ouvrir la porte du garage
	}

}
