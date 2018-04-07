package design_patterns.creational.abstractFactory;

import design_patterns.creational.abstractFactory.soldiers.Soldier;
import design_patterns.creational.abstractFactory.vehicles.Vehicle;

public interface UnitFactory {
	Soldier createSoldier();
	Vehicle createVehicle();
}
