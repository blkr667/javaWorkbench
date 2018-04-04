package design_patterns.structural.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArmoredCarTest {
	private final String STANDARD_DRIVE_TYPE = "standard drive";
	private final String ARMORED_DRIVE_IMPROVEMENT = " but safe";
	
	@Test 
	public void shouldDriveSuccessfully_withArmoredCarDecorator() {
		//given
		ArmoredCar car = new ArmoredCar(new StandardCar(STANDARD_DRIVE_TYPE));
		
		//when
		String resultDriveType = car.drive();
		
		//then
		assertEquals(resultDriveType, STANDARD_DRIVE_TYPE + ARMORED_DRIVE_IMPROVEMENT);
	}
	
}
