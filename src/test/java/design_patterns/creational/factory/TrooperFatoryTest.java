package design_patterns.creational.factory;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Before;
import org.junit.Test;

import design_patterns.creational.factory.troopers.DeathTrooper;
import design_patterns.creational.factory.troopers.SnowTrooper;
import design_patterns.creational.factory.troopers.StormTrooper;
import design_patterns.creational.factory.troopers.Trooper;

public class TrooperFatoryTest {

	private TrooperFactory testObject;
	
	@Before
	public void setUp() {
		testObject = new TrooperFactory();
	}
	
	@Test 
	public void shouldCreateStormTrooper() {
		//when
		Trooper resultTrooper = testObject.createTrooper(TrooperType.STORM_TROOPER);
		
		//then
		assertThat(resultTrooper, instanceOf(StormTrooper.class));
	}
	
	@Test 
	public void shouldCreateDeathTrooper() {
		//when
		Trooper resultTrooper = testObject.createTrooper(TrooperType.DEATH_TROOPER);
		
		//then
		assertThat(resultTrooper, instanceOf(DeathTrooper.class));
	}
	
	@Test 
	public void shouldCreateSnowTrooper() {
		//when
		Trooper resultTrooper = testObject.createTrooper(TrooperType.SNOW_TROOPER);
		
		//then
		assertThat(resultTrooper, instanceOf(SnowTrooper.class));
	}
}
