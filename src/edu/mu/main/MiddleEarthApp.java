package edu.mu.main;
import edu.mu.characters.Elf;
import edu.mu.cms.CharacterManager;
import edu.mu.characters.Orc;

public class MiddleEarthApp {
	public static void main(String[] args) {
		
		/* Derek Testing Code */
		System.out.println("Testing");
		Elf Elf1 = new Elf("Elf 1", 100, 20);
		Elf1.displayInfo();
		
		Orc Orc1 = new Orc("Orc 1", 100, 20);
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		Elf1.attack(Orc1);
		
		Orc1.attack(Elf1);
		Orc1.displayInfo();
		
		/* Tanner Testing Code */
		CharacterManager cm = new CharacterManager();
		cm.addCharacter(Elf1);
		cm.addCharacter(Orc1);
		cm.displayAllCharacters();
		
		cm.deleteCharacter(Orc1);
		cm.displayAllCharacters();
		cm.updateCharacter(Elf1, "Elfer", 100, 20);
		cm.displayAllCharacters();
	}
}
