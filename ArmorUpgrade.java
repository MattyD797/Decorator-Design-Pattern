package decoratordesignpattern;
/**
 * Decoration of the player that upgrades the players armor. 
 * @author Matt Duggan
 */
public class ArmorUpgrade extends PlayerDecorator{

	private Player player;
	
	/**
	 * Constructs the decorator by calling all the cahracteristics of the player being upgraded. 
	 * @param player The player that is getting an armor upgrade. 
	 */
	public ArmorUpgrade(Player player) {
		super();
		this.player = player;
	}
	
	/**
	 * Displays the armor is being upgraded. 
	 * @return A string that says armor upgraded. 
	 */
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
	
	/**
	 * Upgrades the power of the player by 3 points. 
	 * @return The points of power of the player. 
	 */
	public double getPower() {
		return player.getPower() + 3;
	}
}
