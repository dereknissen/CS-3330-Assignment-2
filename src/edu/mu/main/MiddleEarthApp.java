package edu.mu.main;
import edu.mu.characters.*;
import edu.mu.council.MiddleEarthCouncil;
import edu.mu.menu.Menu;

public class MiddleEarthApp {
	public static void main(String[] args) {
		/* Create an elf and orc and put them into the Character Manager */
		MiddleEarthCouncil council = new MiddleEarthCouncil();
		Elf Elf1 = new Elf("Elf 1", 100, 20);
		Orc Orc1 = new Orc("Orc 1", 100, 20);
		council.getCharacterManager().addCharacter(Elf1);
		council.getCharacterManager().addCharacter(Orc1);
		council.getCharacterManager().displayAllCharacters();
		/* Elf destroys the orc */
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		
		/* Orc tries to attack elf but cannot and is deleted */
		Orc1.attack(Elf1);
		Orc1.displayInfo();
		council.getCharacterManager().deleteCharacter(Orc1);
		council.getCharacterManager().displayAllCharacters();

		/* Change name and power of elf */
		council.getCharacterManager().updateCharacter(Elf1, "Elfer", 100, 50);
		council.getCharacterManager().displayAllCharacters();
	}
}
