package designPatterns.structural.adapter;
/*
 * Adapter interface
 */
public interface VehicleIndustry {
	String[] produceVehicle(VehicleType type, int amount);
	String[] produceVehicle(VehicleType type);
}
