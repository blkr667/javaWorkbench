package designPatterns.creational.builder;

public class Ranger {
	private boolean nightVision;
	private boolean bulletproofVest;
	private Gun gun;
	
	public Ranger(boolean nightVision, boolean bulletproofVest, Gun gun) {
		this.nightVision = nightVision;
		this.bulletproofVest = bulletproofVest;
		this.gun = gun;
	}

	public boolean isNightVision() {
		return nightVision;
	}
	public boolean isBulletproofVest() {
		return bulletproofVest;
	}
	public Gun getGun() {
		return gun;
	}
}
