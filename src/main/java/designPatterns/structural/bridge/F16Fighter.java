package designPatterns.structural.bridge;

public class F16Fighter extends Fighter {
	public F16Fighter(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public void applyWeapon() {
		this.status = this.weapon.applyWeapon();	
	}
}
