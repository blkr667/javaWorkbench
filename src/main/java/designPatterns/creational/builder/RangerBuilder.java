package designPatterns.creational.builder;

public class RangerBuilder {
	private boolean nightVision = false;
	private boolean bulletproofVest = false;
	private Gun gun = Gun.MP5;
	
	public RangerBuilder addNightVision() {
		nightVision = true;
		return this;
	};
	
	public RangerBuilder addBulletproofVest() {
		bulletproofVest = true;
		return this;
	};
	
	public RangerBuilder setGun(Gun gun) {
		this.gun = gun;
		return this;
	};
	
	public Ranger createRanger() {
		return new Ranger(nightVision, bulletproofVest, gun);
	}
}
