package designPatterns.structural.adapter;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


public class JapanVehicleIndustryTest {
	private JapanVehicleIndustry japanVehicleIndustry;
	private JapanCarIndustry carIndustry;
	private JapanPlaneIndustry planeIndustry;
	@Before
	public void setUp() {
		carIndustry = mock(JapanCarIndustry.class);
		planeIndustry = mock(JapanPlaneIndustry.class);
		japanVehicleIndustry = new JapanVehicleIndustry(carIndustry, planeIndustry);
	}
	
	@Test 
	public void shouldProduce3Cars() {
		when(carIndustry.produceCar(3)).thenReturn(new String[] {"car", "car", "car"});
		
		String[] resultCars = japanVehicleIndustry.produceVehicle(VehicleType.CAR, 3);
		
		assertArrayEquals(new String[] {"car", "car", "car"}, resultCars);
	}
	
	@Test 
	public void shouldProduceCar() {
		when(carIndustry.produceCar(1)).thenReturn(new String[] {"car"});
		
		String[] resultCar = japanVehicleIndustry.produceVehicle(VehicleType.CAR);
		
		assertArrayEquals(new String[] {"car"}, resultCar);
	}
	
	@Test 
	public void shouldProducePlane() {
		when(planeIndustry.producePlane()).thenReturn("plane");
		
		String[] resultPlane = japanVehicleIndustry.produceVehicle(VehicleType.PLANE);
		
		assertArrayEquals(new String[] {"plane"}, resultPlane);
	}
	
	@Test 
	public void shouldProduce3Planes() {
		when(planeIndustry.producePlane()).thenReturn("plane");
		
		String[] resultPlane = japanVehicleIndustry.produceVehicle(VehicleType.PLANE, 3);
		
		assertArrayEquals(new String[] {"plane", "plane", "plane"}, resultPlane);
		verify(planeIndustry, times(1)).producePlane();
	}
}
