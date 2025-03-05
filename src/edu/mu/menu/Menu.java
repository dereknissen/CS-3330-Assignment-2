package edu.mu.menu;
import java.util.Scanner;
import edu.mu.council.MiddleEarthCouncil;
import edu.mu.characters.*;

public class Menu {
	
	/**
	 * Not sure if this should be an actual java interface
	 */
	public void menuStart() {
		Scanner keyboard = new Scanner(System.in);
		MiddleEarthCouncil council = new MiddleEarthCouncil();
		
		String race;
		String name;
		double health;
		double power;
		do {
			System.out.println("What would you like to do?\n1. Add a new character.\n2. View all characters."
					+ "\n3. Update a characeter.\n4. Delete a character.\n5. Execute "
					+ "all characters' attack actions.\n6. Exit.\nEnter an integer 1-6: ");
			switch (keyboard.nextInt()) {
			case 1:
				System.out.println("Please enter the race, name, health, and power of the character: ");
				race = keyboard.next();
				name = keyboard.next();
				health = keyboard.nextDouble();
				power = keyboard.nextDouble();
				if (race.toLowerCase().equals("elf")) {
					Elf elf = new Elf(name, health, power);
					council.getCharacterManager().addCharacter(elf);
				} else if (race.toLowerCase().equals("dwarf")) {
					Dwarf dwarf = new Dwarf(name, health, power);
					council.getCharacterManager().addCharacter(dwarf);
				} else if (race.toLowerCase().equals("human")) {
					Human human = new Human(name, health, power);
					council.getCharacterManager().addCharacter(human);
				} else if (race.toLowerCase().equals("orc")) {
					Orc orc = new Orc(name, health, power);
					council.getCharacterManager().addCharacter(orc);
				} else if (race.toLowerCase().equals("wizard")) {
					Wizard wizard = new Wizard(name, health, power);
					council.getCharacterManager().addCharacter(wizard);
				} else {
					System.out.println("Not a valid middle earth race. Character addition ending...");
					break;
				}
				System.out.println("Character added succesfully.");
			case 2:
				council.getCharacterManager().displayAllCharacters();
				break;
			case 3:
				System.out.println("Please enter the name, health, and power of the character: ");
				name = keyboard.next();
				health = keyboard.nextDouble();
				power = keyboard.nextDouble();
				if (!council.getCharacterManager().updateCharacter(council.getCharacterManager().getCharacter(name), name, (int)health, (int)power)) {
					System.out.println("Character not updated.");
					break;
				}
				System.out.println("Character updated succesfully.");
				break;
			case 4:
				System.out.println("Please enter the name of the character: ");
				name = keyboard.next();
				if(!council.getCharacterManager().deleteCharacter(council.getCharacterManager().getCharacter(name))) {
					System.out.println("Character deletion failed.");
					break;
				}
				System.out.println("Character deleted succesfully.");
				break;
			case 5:
				break;
			case 6:
			default:
				keyboard.close();
				System.exit(0);
			}
		} while (true);
	}
}
