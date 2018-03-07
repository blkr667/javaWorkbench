package design_patterns.creational.singleton;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

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