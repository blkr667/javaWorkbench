package designPatterns.creational.abstractFactory.soldiers;

public class Marine implements Soldier{

	@Override
	public SoldierType getType() {
		return SoldierType.MARINE;
	}

}
