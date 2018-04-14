package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.soldiers.Soldier;
import designPatterns.creational.abstractFactory.vehicles.Vehicle;

public interface UnitFactory {
	Soldier createSoldier();
	Vehicle createVehicle();
}
