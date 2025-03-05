package edu.mu.cms;
import edu.mu.characters.MiddleEarthCharacter;

public class CharacterManager {
	
	private MiddleEarthCharacter[] characters;
	private int size;
	
	
	/**
	 * Default constructor
	 */
	public CharacterManager() {
		this.characters = new MiddleEarthCharacter[5];
		size = 0;
	}
	
	/**
	 * Adds a character to the Character Manager and doubles the size of Character Manager if full
	 * @param character
	 * @return
	 */
	public boolean addCharacter(MiddleEarthCharacter character) {
		if (character == null) {
			return false;
		}
		else if (size == characters.length) {
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
			
			for (int i = 0; i < size; i++) {
				newArray[i] = characters[i];
			}
			this.characters = newArray;
		}
		characters[size] = character;
		size++;
		return true;
	} 
	
	/**
	 * Searches for a character in the Character Manager and returns them
	 * @param name
	 * @return
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		for (int i = 0; i < size; i++) {
			if (characters[i].getName().equals(name)) {
				return characters[i];
			}
		}
		return null;
	}
	
	/**
	 * Updates a characters name, health, and/or power. Returns false if there are no changes or character does not exist
	 * @param character
	 * @param name
	 * @param health
	 * @param power
	 * @return
	 */
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
		if (character.getName() == name && character.getHealth() == health && character.getPower() == power) {
			return false;
		}
		if (this.getCharacter(name) != null) {
			character.setName(name);
			character.setHealth(health);
			character.setPower(power);
			return true;
		}
		return false;
	}
	
	/**
	 * Deletes a character form the Character Manager and shifts elements over
	 * @param character
	 * @return
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		for (int i = 0; i < size; i++) {
			if (characters[i].equals(character)) {
				for (int j = i; j < size-1; j++) {
					characters[j] = characters[j+1];
				}
				characters[size] = null;
				size--;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Displays the name, health, and power of all characters
	 */
	public void displayAllCharacters() {
		for (int i = 0; i < size; i++) {
			characters[i].displayInfo();
		}
	}
}

