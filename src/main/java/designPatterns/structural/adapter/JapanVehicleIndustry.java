package designPatterns.structural.adapter;

import java.util.Arrays;

/*
 * Adapter class
 * 
 *  * Adapt incompatible interfaces into common interface
 */
public class JapanVehicleIndustry implements VehicleIndustry{
	private final JapanCarIndustry japanCarIndustry;
	private final JapanPlaneIndustry japanPlaneIndustry;
	private static final String PRODUCTCTION_NOT_SUPPORTED_MSG = 
			"Production of vehicle type: %s is not supported by industry";
	
	public JapanVehicleIndustry(JapanCarIndustry japanCarIndustry, JapanPlaneIndustry japanPlaneIndustry) {
		this.japanCarIndustry = japanCarIndustry;
		this.japanPlaneIndustry = japanPlaneIndustry;
	}
	
	@Override
	public String[] produceVehicle(VehicleType type, int amount) {
		if(type == VehicleType.CAR) {
			return japanCarIndustry.produceCar(amount);
		} else if(type == VehicleType.PLANE) {
			String[] planes = new String[amount];
			Arrays.fill(planes, japanPlaneIndustry.producePlane());
			return planes;
		}
		throw new IllegalStateException(String.format(PRODUCTCTION_NOT_SUPPORTED_MSG, type));
	}

	@Override
	public String[] produceVehicle(VehicleType type) {
		if(type == VehicleType.CAR) {
			return japanCarIndustry.produceCar(1);
		} else if(type == VehicleType.PLANE) {
			return new String[]{japanPlaneIndustry.producePlane()};
		}
		throw new IllegalStateException(String.format(PRODUCTCTION_NOT_SUPPORTED_MSG, type));
	}
}
