package decoratordesignpattern;
/**
 * Decorates the player by upgrading the players weapon. 
 * @author Matt Duggan
 */
public class WeaponUpgrade extends PlayerDecorator{

	private Player player;
	
	/**
	 * Takes in the information of the player getting upgraded.
	 * @param player The player getting upgraded.
	 */
	public WeaponUpgrade(Player player) {
		super();
		this.player = player;
	}
	
	/**
	 * Displays that the weapon has been upgraded. 
	 * @return String of the weopan being upgraded. 
	 */
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}

	/**
	 * Upgrades the power of a player by 5 points. 
	 * @return Power of the player. 
	 */
	public double getPower() {
		return player.getPower() + 5;
	}

}
