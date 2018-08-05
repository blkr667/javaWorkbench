package designPatterns.structural.bridge;

public class StandardWeapon implements Weapon {
	public FighterStatus applyWeapon() {
		return FighterStatus.ARMORED_WITH_MACHINE_GUN;
	}
}
