package test;

import cmd.DivCommand;
import cmd.MultipCommand;
import cmd.PlusCommand;
import cmd.SoustCommand;
import cmd.SqrtCommand;
import cmd.control.CalculatriceControl;
import cmd.in.Command;
import cmd.receive.Calculatrice;

public class Client {
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();

		Command plusCommand = new PlusCommand(calculatrice, 1, 3);
		Command multCommand = new MultipCommand(calculatrice, 4, 5);
		Command sousCommand = new SoustCommand(calculatrice, 8, 12);
		Command divCommand = new DivCommand(calculatrice, 7, 4);
		Command sqrtCommand = new SqrtCommand(calculatrice, 9);

		CalculatriceControl control = new CalculatriceControl();

		control.setCommand(0, plusCommand);
		control.buttonPressed(0);
		control.setCommand(1, sousCommand);
		control.buttonPressed(1);
		control.setCommand(2, divCommand);
		control.buttonPressed(2);
		control.setCommand(3, multCommand);
		control.buttonPressed(3);
		control.setCommand(4, sqrtCommand);
		control.buttonPressed(4);
	}
}
