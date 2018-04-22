package designPatterns.behavioral.templateMethod;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JeepPartsProviderTest {
	private JeepPartsProvider jeepPartsProvider;
	@Before
	public void setUp() {
		jeepPartsProvider = new JeepPartsProvider();
	}
		
	@Test 
	public void shouldProvideParts_whenDangerousEnvironment_andBigCapacity() {
		List<VehiclePart> resultParts =jeepPartsProvider.provideVehicleParts(true, 6);
		
		assertThat(resultParts, is(Arrays.asList(VehiclePart.STRONG_CHASSIS, VehiclePart.ARMORED_BODY, VehiclePart.ENGINE)));
	}
	
	@Test 
	public void shouldProvideParts_whenNotDangerousEnvironment_andLowCapacity() {
		List<VehiclePart> resultParts =jeepPartsProvider.provideVehicleParts(false, 2);
		
		assertThat(resultParts, is(Arrays.asList(VehiclePart.STANDARD_CHASSIS, VehiclePart.STANDARD_BODY, VehiclePart.ENGINE)));
	}
}
