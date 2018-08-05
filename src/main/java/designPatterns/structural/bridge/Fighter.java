package designPatterns.structural.bridge;

public abstract class Fighter {
	protected Weapon weapon;
	protected FighterStatus status;

	public Fighter(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public FighterStatus getFighterStatus() {
		return this.status;
	}
	
	abstract public void applyWeapon();
}
