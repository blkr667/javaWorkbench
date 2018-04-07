package design_patterns.creational.abstractFactory;

public class MilitaryBuildingFactory {
	public UnitFactory createMilitaryBuilding(MilitaryBuildingType type) {
		if (type.equals(MilitaryBuildingType.ELITE)) {
			return new EliteArmoryFactory();
		} else {
			return new ArmoryFactory();
		}
	}
}
