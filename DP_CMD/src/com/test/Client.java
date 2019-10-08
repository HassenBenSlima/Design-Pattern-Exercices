package com.test;

import com.cmd.Command;
import com.cmd.CommandA;
import com.cmd.CommandB;
import com.cmd.CommandC;
import com.cmd.Invoqueur;
import com.cmd.RecepteurImpl1;
import com.cmd.RecepteurImpl2;

public class Client {

	public static void main(String[] args) {
		RecepteurImpl1 rec1 = new RecepteurImpl1();
		RecepteurImpl2 rec2 = new RecepteurImpl2();

		Command cmd1 = new CommandA(rec1);
		Command cmd2 = new CommandB(rec1);
		Command cmd3 = new CommandC(rec2);

		Invoqueur telecommande = new Invoqueur();

		telecommande.addNewCommand("A", cmd1);
		telecommande.addNewCommand("B", cmd2);
		telecommande.addNewCommand("C", cmd3);
		
		telecommande.invoquer("A");
		telecommande.invoquer("B");
		telecommande.invoquer("C");
		telecommande.invoquer("D");
		
	}

}
