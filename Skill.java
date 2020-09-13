package decoratordesignpattern;
/**
 * The decoration skill that is the players experience at his position.
 * @author Matt Duggan
 */
public class Skill extends PlayerDecorator{

	private Player player;
	/**
	 * Calls onto the player and allows access to player information.
	 * @param player The name and abilities of the player. 
	 */
	public Skill(Player player) {
		super();
		this.player = player;
	}
	
	/**
	 * Display says that skill is gained. 
	 */
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	
	/**
	 * The skill upgrade powers the player up by two. 
	 */
	public double getPower() {
		return player.getPower()+2;
	}
	
}
