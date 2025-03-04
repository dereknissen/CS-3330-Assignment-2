package edu.mu.cms;
import edu.mu.characters.MiddleEarthCharacter;

public class CharacterManager {
	
	private MiddleEarthCharacter[] characters;
	private int size;
	
	public CharacterManager() {
		this.characters = new MiddleEarthCharacter[5];
		size = 0;
	}
	
	public boolean addCharacter(MiddleEarthCharacter c) {
		if (c == null) {
			return false;
		}
		else if (size == characters.length) {
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
			
			for (int i = 0; i < size; i++) {
				newArray[i] = characters[i];
			}
			this.characters = newArray;
		}
		characters[size] = c;
		size++;
		return true;
	} 
	
	public MiddleEarthCharacter getCharacter(String name) {
		for (int i = 0; i < size; i++) {
			if (characters[i].getName().equals(name)) {
				return characters[i];
			}
		}
		return null;
	}
}

