package designPatterns.behavioral.templateMethod;

import java.util.Arrays;
import java.util.List;

/*
 * Template Method
 */
public abstract class VehiclePartsProvider {
	public List<VehiclePart> provideVehicleParts(boolean adjustedToDangerEnvironment, int capacity) {
		return Arrays.asList(
				getChassis(capacity),
				getBody(adjustedToDangerEnvironment),
				getEngine());
	};
	
	private VehiclePart getEngine() {
		return VehiclePart.ENGINE;
	}
	
	protected abstract VehiclePart getBody(boolean adjustedToDangerEnvironment);
	
	protected abstract VehiclePart getChassis(int capacity);
}
