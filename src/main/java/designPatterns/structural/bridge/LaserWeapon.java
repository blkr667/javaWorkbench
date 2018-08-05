package designPatterns.structural.bridge;

public class LaserWeapon implements Weapon {
	 public FighterStatus applyWeapon() {
		return FighterStatus.ARMORED_WITH_LASER;
	}
}
