package designPatterns.creational.abstractFactory.soldiers;

public class Sniper implements Soldier{
	
	@Override
	public SoldierType getType() {
		return SoldierType.SNIPER;
	}
	
}
