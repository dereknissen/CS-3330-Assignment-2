package edu.mu.characters;

public class Dwarf extends MiddleEarthCharacter {
	
	private String cantAttack = "Wizard";

	/**
	 * Default constructor
	 * @param name
	 * @param health
	 * @param power
	 */
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	
	/**
	 * Attack method.
	 * Returns false if the attack was ineffective. Otherwise, returns true.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		// In case character is already dead
		if (super.getHealth() <= 0) {
			System.out.println("The attack was ineffective because the attacker is already dead.");
			return false;
		}
		
		// Determine whether the attack will be ineffective
		String targetRace = target.getRace();
		if (targetRace.equals(this.getRace())) {
			System.out.println("Attack was against their own kin.");
			return false;
		}  else if (targetRace.equals(cantAttack)) {
			System.out.println("Attack was ineffective.");
			return false;
		}
		
		// Determine damage to be dealt
		double damage = super.getPower(); // Default damage is retrieved from power
		if (targetRace.equals("Elf")) {
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
		return "Dwarf";
	}
	
}
