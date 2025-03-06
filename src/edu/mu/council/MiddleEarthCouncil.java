package edu.mu.council;

import edu.mu.cms.CharacterManager;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	/**
	 * Default constructor
	 */
	private MiddleEarthCouncil() {
		this.characterManager = new CharacterManager();
	}
	
	/**
	 * Returns the singleton instance of the MiddleEarthCouncil
	 * @return
	 */
	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	/**
	 * Returns the instance of the CharacterManager
	 * @return
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
}