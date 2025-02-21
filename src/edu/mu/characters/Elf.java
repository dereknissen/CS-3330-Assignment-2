package edu.mu.characters;

public class Elf extends MiddleEarthCharacter {

	/**
	 * Default constructor
	 * @param name
	 * @param health
	 * @param power
	 */
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// TODO Auto-generated method stub
		String targetName = target.getRace();
		double damage = super.getPower();
		
		System.out.println(super.getName() + " has attacked " + target.getName() + " with " + Double.toString(damage) + " damage.");
		target.takeDamage(damage);
		return false;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return "Elf";
	}
	
}
