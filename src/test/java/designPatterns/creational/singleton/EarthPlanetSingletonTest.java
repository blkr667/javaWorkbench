package designPatterns.creational.singleton;

import org.junit.Test;

import designPatterns.creational.singleton.EarthPlanetSingleton;

import static org.junit.Assert.*;

public class EarthPlanetSingletonTest {
	
	@Test 
	public void shouldGetInstanceSuccessfully() {
		//when
		EarthPlanetSingleton instance = EarthPlanetSingleton.getInstance();
		
		//then
		assertNotNull(instance);
	}
	
	@Test 
	public void shouldGetInstanceReturnSameReference_whenGetSecondInstance() {
		//given
		EarthPlanetSingleton firstInstance = EarthPlanetSingleton.getInstance();
		
		//when
		EarthPlanetSingleton secondInstance = EarthPlanetSingleton.getInstance();
		
		//then
		assertEquals(firstInstance, secondInstance);
	}

}