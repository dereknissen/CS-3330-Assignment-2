package edu.mu.characters;

public abstract class MiddleEarthCharacter {
	
	private String name;
	private double health;
	private double power;
	
	/**
	 * Default constructor
	 * @param name
	 * @param health
	 * @param power
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/**
	 * This method prints the character details in a readable format.
	 */
	public void displayInfo() {
		System.out.println(name + ": Health = " + Double.toString(health) + "% Power = " + Double.toString(power));
	}
	
	/**
	 * Abstract attack method
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * Abstract get race method
	 */
	public abstract String getRace();
	
	
	/**
	 * Returns the power of the character
	 * @return
	 */
	public double getPower() {
		return this.power;
	}
	
	/**
	 * Sets power of the character using power parameter
	 * @param power
	 */
	public void setPower(double power) {
		this.power = power;
	}
	
	/**
	 * Returns the health of the character
	 * @return
	 */
	public double getHealth() {
		return this.health;
	}
	
	/**
	 * Sets health of the character using health parameter
	 * @param health
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * Returns the name of the character
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets name of the character using name parameter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Will inflict damage to the character
	 * Returns false if the character dies and returns true otherwise.
	 * @param damage
	 * @return
	 */
	public boolean takeDamage(double damage) {
		if (damage >= this.health) {
			this.health = 0;
			System.out.println(this.getRace() + " has died.");
			return false;
		}
		this.health = this.health - damage;
		System.out.println("Damage was taken");
		return true;
	}
}
