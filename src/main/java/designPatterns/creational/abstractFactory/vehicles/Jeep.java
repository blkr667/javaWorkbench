package designPatterns.creational.abstractFactory.vehicles;

public class Jeep implements Vehicle {

	@Override
	public VehicleType getType() {
		return VehicleType.JEEP;
	}

}
