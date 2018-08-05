package designPatterns.structural.bridge;

public class TieFighter extends Fighter {
	public TieFighter(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public void applyWeapon() {
		this.status = this.weapon.applyWeapon();	
	}
}
