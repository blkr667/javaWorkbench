package designPatterns.behavioral.templateMethod;


/*
 * Template Method
 */
public class JeepPartsProvider extends VehiclePartsProvider {
	protected VehiclePart getBody(boolean adjustedToDangerEnvironment) {
		if(adjustedToDangerEnvironment)
			return VehiclePart.ARMORED_BODY;
		return VehiclePart.STANDARD_BODY;
		
	};
	
	protected VehiclePart getChassis(int capacity) {
		if(capacity > 5) 
			return VehiclePart.STRONG_CHASSIS;
		
		return VehiclePart.STANDARD_CHASSIS;
	};
}
