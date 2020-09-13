package decoratordesignpattern;

/**
 * This is a character in a video game. Players can be upgraded and have several attributes that need to be defined. 
 * @author Matt Duggan
 */
public abstract class Player {
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * Prints out the same message for all player types with specific weapon and armor type. 
	 * @return String of the players name, carries a weapon and the armor. 
	 */
	public String toString() {
		return this.name + "\nCarries a " + this.weapon + ", and wears a " + this.armor;
	}
	
	/**
	 * The power of the player that gives the player its strength. 
	 * @return The calculated power of players ability. 
	 */
	public double getPower() {
		return this.attack * 3 + this.defense + this.intellect / 2;
		
	}

}
