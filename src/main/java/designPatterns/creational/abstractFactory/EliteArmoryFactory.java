package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.soldiers.Sniper;
import designPatterns.creational.abstractFactory.soldiers.Soldier;
import designPatterns.creational.abstractFactory.vehicles.Tank;
import designPatterns.creational.abstractFactory.vehicles.Vehicle;

public class EliteArmoryFactory implements UnitFactory {

	@Override
	public Soldier createSoldier() {
		return new Sniper();
	}

	@Override
	public Vehicle createVehicle() {
		return new Tank();
	}

}
