package decoratordesignpattern;
/**
 * The warrior is a brave and most powerful player in a videogame. 
 * @author Matt Duggan
 *
 */
public class Warrior extends Player{

	/**
	 * The characteristics of the warrior. 
	 * @param name Name of the player. 
	 */
	public Warrior(String name) {
		super();
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	/**
	 * Displays the type of player: warrior. 
	 * @return The type of player, name of the player, power and upgrades. 
	 */
	public String toString() {
		return "Warrior: " + super.toString();
	}
}
