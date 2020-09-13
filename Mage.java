package decoratordesignpattern;

public class Mage extends Player{

	public Mage(String name) {
		super();
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	public String toString() {
		return "Mage: " + super.toString();
	}
}
