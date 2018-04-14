package designPatterns.creational.prototype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import designPatterns.creational.prototype.Sheep;


public class SheepTest {

	private Sheep testSheep;
	
	@Before
	public void setUp() {
		testSheep = new Sheep(22, "Betsy");
	}
	
	@Test 
	public void shouldClonedSheepHasEqualsParameters() {
		//when
		Sheep clonedSheep = testSheep.getClonedSheep();
		
		//then
		assertEquals(testSheep, clonedSheep);
	}
	
	@Test 
	public void shouldClonedSheepHasDifferendRefernce() {
		//when
		Sheep clonedSheep = testSheep.getClonedSheep();
		
		//then
		assertFalse(testSheep == clonedSheep);
	}
	

}
