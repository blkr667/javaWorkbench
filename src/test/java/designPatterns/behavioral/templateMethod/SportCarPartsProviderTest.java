package designPatterns.behavioral.templateMethod;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SportCarPartsProviderTest {
	private SportCarPartsProvider sportCarPartsProvider;
	@Before
	public void setUp() {
		sportCarPartsProvider = new SportCarPartsProvider();
	}
		
	
	@Test 
	public void shouldProvideParts_whenNotDangerousEnvironment_andLowCapacity() {
		List<VehiclePart> resultParts = sportCarPartsProvider.provideVehicleParts(false, 2);
		
		assertThat(resultParts, is(Arrays.asList(VehiclePart.STANDARD_CHASSIS, VehiclePart.SPORT_BODY, VehiclePart.ENGINE)));
	}
	
	@Test(expected = IllegalStateException.class)  
	public void shouldFail_whenDangerousEnvironment() {
		sportCarPartsProvider.provideVehicleParts(true, 2);
	}
	
	@Test(expected = IllegalStateException.class)  
	public void shouldFail_whenBigCapacity() {
		sportCarPartsProvider.provideVehicleParts(false, 8);
	}
}
