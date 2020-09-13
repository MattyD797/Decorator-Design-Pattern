package decoratordesignpattern;
/**
 * A player that heals other people in a game. 
 * @author Matt Duggan
 */
public class Healer extends Player{
	
	/**
	 * The characteristics of a healer. 
	 * @param name The name of the player. 
	 */
	public Healer(String name) {
		super();
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Displays the type of player: Healer. 
	 * @return The player type along with the upgrades and power. 
	 */
	public String toString() {
		return "Healer: " + super.toString();
	}
}
