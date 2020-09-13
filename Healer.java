package decoratordesignpattern;

public class Healer extends Player{

	public Healer(String name) {
		super();
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	public String toString() {
		return "Healer: " + super.toString();
	}
}
