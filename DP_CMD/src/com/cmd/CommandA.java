package com.cmd;

public class CommandA implements Command {

	private RecepteurImpl1 recepteur;

	public CommandA(RecepteurImpl1 recepteur) {
		super();
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.action1();
	}

}
