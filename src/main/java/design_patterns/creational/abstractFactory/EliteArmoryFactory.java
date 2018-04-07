package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.soldiers.Sniper;
import design_patterns.creational.abstractFactory.soldiers.Soldier;
import design_patterns.creational.abstractFactory.vehicles.Tank;
import design_patterns.creational.abstractFactory.vehicles.Vehicle;

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
