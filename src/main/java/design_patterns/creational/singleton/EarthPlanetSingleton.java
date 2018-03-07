package design_patterns.creational.singleton;

public class EarthPlanetSingleton {
	private static EarthPlanetSingleton earthPlanetInstance = new EarthPlanetSingleton();

	private EarthPlanetSingleton(){}

	public static EarthPlanetSingleton getInstance(){
		return earthPlanetInstance;
	}
}