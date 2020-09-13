package decoratordesignpattern;

/**
 * The requirements of an upgrade to a player of a video game. 
 * @author Matt Duggan
 */
public abstract class PlayerDecorator extends Player{

	public abstract String toString();
	
	public abstract double getPower();
}
