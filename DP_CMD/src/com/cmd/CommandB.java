package com.cmd;

public class CommandB implements Command {

	private RecepteurImpl1 recepteur;

	public CommandB(RecepteurImpl1 recepteur) {
		super();
		this.recepteur = recepteur;
	}

	@Override
	public void executer() {
		recepteur.action2();
	}

}
