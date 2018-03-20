package design_patterns.creational.prototype;

public class Sheep implements SheepPrototype {
	private int weight;
	private String name;
	
	public Sheep(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public Integer getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}

	@Override
	public Sheep getClonedSheep() {
		return new Sheep(weight, name);
	}
	
	public boolean equals(Object otherObject) {
		if(!(otherObject instanceof Sheep))
			return false;
		
		Sheep otherSheep = (Sheep)otherObject;
		
		return this.getWeight().equals(otherSheep.getWeight())
				&& this.getName().equals(otherSheep.getName());
	}
}
