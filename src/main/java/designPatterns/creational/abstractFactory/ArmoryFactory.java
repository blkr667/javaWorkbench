package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.soldiers.Marine;
import designPatterns.creational.abstractFactory.soldiers.Soldier;
import designPatterns.creational.abstractFactory.vehicles.Jeep;
import designPatterns.creational.abstractFactory.vehicles.Vehicle;

public class ArmoryFactory implements UnitFactory {

	@Override
	public Soldier createSoldier() {
		return new Marine();
	}

	@Override
	public Vehicle createVehicle() {
		return new Jeep();
	}

}
