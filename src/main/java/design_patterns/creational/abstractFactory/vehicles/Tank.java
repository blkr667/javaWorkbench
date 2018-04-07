package design_patterns.creational.abstractFactory.vehicles;

public class Tank implements Vehicle {

	@Override
	public VehicleType getType() {
		return VehicleType.TANK;
	}

}
