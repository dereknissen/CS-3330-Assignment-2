package edu.mu.menu;

import edu.mu.characters.*;
import edu.mu.council.MiddleEarthCouncil;

public interface Menu {
	
	/**
	 * Uses menu to add character to the council
	 * @param race
	 * @param name
	 * @param health
	 * @param power
	 */
	public static void addChar(String race, String name, double health, double power) {
		if (race.toLowerCase().equals("elf")) {
			MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Elf(name, health, power));
		} else if (race.toLowerCase().equals("dwarf")) {
			MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Dwarf(name, health, power));
		} else if (race.toLowerCase().equals("human")) {
			MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Human(name, health, power));
		} else if (race.toLowerCase().equals("orc")) {
			MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Orc(name, health, power));
		} else if (race.toLowerCase().equals("wizard")) {
			MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Wizard(name, health, power));
		} else {
			System.out.println("Not a valid middle earth race. Character addition ending.");
			return;
		}
		System.out.println("Character added succesfully.");
	}
	
	/**
	 * Displays all of the info of all characters
	 */
	public static void viewAllChar() {
		MiddleEarthCouncil.getInstance().getCharacterManager().displayAllCharacters();
	}
	
	/**
	 * Updates a character using the menu
	 * @param name
	 * @param newName
	 * @param health
	 * @param power
	 */
	public static void updateChar(String name, String newName, double health, double power) {
		MiddleEarthCouncil.getInstance().getCharacterManager().updateCharacter(MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(name), newName, (int)health, (int)power);
	}
	
	/**
	 * Deletes a character based on name
	 * @param name
	 */
	public static void deleteChar(String name) {
		MiddleEarthCouncil.getInstance().getCharacterManager().deleteCharacter(MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(name));
	}
	
	/**
	 * Executes all attacks of characters based on who is to the right of them in the council
	 */
	public static void charAttacks() {
		for (int i = 0; i < MiddleEarthCouncil.getInstance().getCharacterManager().getSize() - 1; i++) {
			MiddleEarthCouncil.getInstance().getCharacterManager().getCharacters()[i].attack(MiddleEarthCouncil.getInstance().getCharacterManager().getCharacters()[i+1]);
		}
		MiddleEarthCouncil.getInstance().getCharacterManager().getCharacters()[MiddleEarthCouncil.getInstance().getCharacterManager().getSize()-1].attack(MiddleEarthCouncil.getInstance().getCharacterManager().getCharacters()[0]);
	}
	
	/**
	 * Exits the program
	 */
	public static void exit() {
		System.out.println("Exiting the program...");
		System.exit(0);
	}
}
