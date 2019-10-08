package cmd.control;

import cmd.in.Command;

public class CalculatriceControl {
	private Command[] cmd;

	public CalculatriceControl() {
		this.cmd = new Command[10];
		Command noCommand = new noCommand();
		for (int i = 0; i < 10; i++) {
			cmd[i] = noCommand;
		}

	}

	public void setCommand(int i, Command cmd) {
		this.cmd[i] = cmd;
	}

	public void buttonPressed(int i) {
		cmd[i].execute();

	}

}
