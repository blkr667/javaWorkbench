package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.soldiers.Marine;
import design_patterns.creational.abstractFactory.soldiers.Soldier;
import design_patterns.creational.abstractFactory.vehicles.Jeep;
import design_patterns.creational.abstractFactory.vehicles.Vehicle;

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
