package edu.mu.main;

import edu.mu.menu.Menu;

public class MiddleEarthApp implements Menu{
	public static void main(String[] args) {
		/* Create an elf and orc and put them into the Middle Earth Council */
		Menu.addChar("Elf", "Elfer", 100, 20);
		Menu.addChar("Orc", "Orcton", 100, 20);
		Menu.viewAllChar();
		
		Menu.charAttacks();
		Menu.charAttacks();
		Menu.charAttacks();
		Menu.charAttacks();
		
		/* The Orc is deleted from the council and a Human is added */
		Menu.viewAllChar();
		Menu.deleteChar("Orcton");
		Menu.addChar("Human", "Buddy", 100, 20);
		
		/* Change name and power of elf */
		Menu.updateChar("Elfer", "Elflet", 100.0, 50.0);
		Menu.viewAllChar();
		
		/* Exiting the program */
		Menu.exit();
	}
}
