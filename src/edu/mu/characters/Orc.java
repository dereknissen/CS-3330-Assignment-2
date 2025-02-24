package edu.mu.characters;

import java.lang.reflect.Array;

public class Orc extends MiddleEarthCharacter {
	
	private String[] cantAttack = {"Orc", "Elf"};

	/**
	 * Default constructor
	 * @param name
	 * @param health
	 * @param power
	 */
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	
	/**
	 * Attack method.
	 * Returns false if the attack was ineffective. Otherwise, returns true.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		// Determine whether the attack will be ineffective
		String targetRace = target.getRace();
		for (int i = 0; i < Array.getLength(cantAttack); i++) {
			if (cantAttack[i] == targetRace) { // If the target race is in the "cantAttack" array, then the attack is ineffective
				System.out.println("Attack was ineffective. Characters can't attack others of the same kin.");
				return false;
			}
		}
		
		// Determine damage to be dealt
		double damage = super.getPower(); // Default damage is retrieved from power
		if (targetRace == "Human") {
			damage*=1.5; // Damage multiplier
		}
		
		// Deal the damage
		System.out.println(super.getName() + " has attacked " + target.getName() + " with " + Double.toString(damage) + " damage.");
		target.takeDamage(damage);
		return true;
	}

	/**
	 * Returns the race of the MiddleEarthCharacter.
	 */
	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return "Orc";
	}
	
}
