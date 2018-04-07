package design_patterns.creational.abstractFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import design_patterns.creational.abstractFactory.soldiers.Soldier;
import design_patterns.creational.abstractFactory.soldiers.SoldierType;
import design_patterns.creational.abstractFactory.vehicles.Vehicle;
import design_patterns.creational.abstractFactory.vehicles.VehicleType;

public class MilitaryBuildingFactoryTest {
	private MilitaryBuildingFactory buildingFactory;
	
	@Before
	public void setUp() {
		buildingFactory = new MilitaryBuildingFactory();
	}
	
	@Test 
	public void shouldcreateStandardSoldier_whenCreatedStandardMilitaryBuilding_byAbstractFactory() {
		//when
		Soldier resultUnit = buildingFactory.createMilitaryBuilding(MilitaryBuildingType.STANDARD).createSoldier();
		
		//then
		assertEquals(resultUnit.getType(), SoldierType.MARINE);
	}
	
	@Test 
	public void shouldcreateStandardVehicle_whenCreatedStandardMilitaryBuilding_byAbstractFactory() {
		//when
		Vehicle resultUnit = buildingFactory.createMilitaryBuilding(MilitaryBuildingType.STANDARD).createVehicle();
		
		//then
		assertEquals(resultUnit.getType(), VehicleType.JEEP);
	}

	@Test 
	public void shouldcreateEliteSoldier_whenCreatedEliteMilitaryBuilding_byAbstractFactory() {
		//when
		Soldier resultUnit = buildingFactory.createMilitaryBuilding(MilitaryBuildingType.ELITE).createSoldier();
		
		//then
		assertEquals(resultUnit.getType(), SoldierType.SNIPER);
	}
	
	@Test 
	public void shouldcreateEliteVehicle_whenCreatedEliteMilitaryBuilding_byAbstractFactory() {
		//when
		Vehicle resultUnit = buildingFactory.createMilitaryBuilding(MilitaryBuildingType.ELITE).createVehicle();
		
		//then
		assertEquals(resultUnit.getType(), VehicleType.TANK);
	}
}
