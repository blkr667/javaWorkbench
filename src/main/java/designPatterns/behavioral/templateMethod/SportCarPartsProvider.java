package designPatterns.behavioral.templateMethod;


/*
 * Template Method
 */
public class SportCarPartsProvider extends VehiclePartsProvider {
	
	private static final int MAX_CAPACITY = 3;
	protected VehiclePart getBody(boolean adjustedToDangerEnvironment) {
		if(adjustedToDangerEnvironment)
			throw new IllegalStateException("sport car have no parts for danger environment");
		return VehiclePart.SPORT_BODY;
		
	};
	
	protected VehiclePart getChassis(int capacity) {
		if(capacity > MAX_CAPACITY) 
			throw new IllegalStateException("max capacity for sport car is " + MAX_CAPACITY + " but given is " + capacity);
		
		return VehiclePart.STANDARD_CHASSIS;
	};
}
