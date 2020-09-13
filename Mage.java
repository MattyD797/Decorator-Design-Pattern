package decoratordesignpattern;
/**
 * The Mage is a magician who does wizard spells in video games. 
 * @author Matt Duggan
 */
public class Mage extends Player{
	
	/**
	 * The characteristics of the mage. 
	 * @param name The name of the player.
	 */
	public Mage(String name) {
		super();
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Displays the type of player. 
	 * @return The type of player, name, power, and upgrades of the player. 
	 */
	public String toString() {
		return "Mage: " + super.toString();
	}
}
