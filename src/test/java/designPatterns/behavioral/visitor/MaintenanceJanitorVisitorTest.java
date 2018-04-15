package designPatterns.behavioral.visitor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import designPatterns.behavioral.visitor.buildings.ProductionBuilding;
import designPatterns.behavioral.visitor.buildings.ResearchBuilding;
import designPatterns.behavioral.visitor.buildings.ShopBuilding;

public class MaintenanceJanitorVisitorTest {
	private MaintenanceJanitorVisitor maintenanceJanitorVisitor;
	@Before
	public void setUp() {
		maintenanceJanitorVisitor = new MaintenanceJanitorVisitor();
	}
	
	@Test 
	public void shouldRepairProductionBuilding() {
		//given
		ProductionBuilding brokenProductionBuilding = new ProductionBuilding(false, true);
		
		//when
		maintenanceJanitorVisitor.visit(brokenProductionBuilding);
		
		//then
		assertFalse(brokenProductionBuilding.isDirty());
	}
	
	@Test 
	public void shouldRepairResearchBuilding() {
		//given
		ResearchBuilding brokenResearchBuilding = new ResearchBuilding(false, true, 2);
		
		//when
		maintenanceJanitorVisitor.visit(brokenResearchBuilding);
		
		//then
		assertFalse(brokenResearchBuilding.isDirty());
	}
	
	@Test 
	public void shouldNotRepairResearchBuilding_whenDirty() {
		//given
		boolean dirtyBuilding = true;
		ResearchBuilding brokenResearchBuilding = new ResearchBuilding(dirtyBuilding, true, 2);
		
		//when
		maintenanceJanitorVisitor.visit(brokenResearchBuilding);
		
		//then
		assertTrue(brokenResearchBuilding.isDirty());
	}
	
	@Test 
	public void shouldRepairShopBuilding() {
		//given
		ShopBuilding brokenShopBuilding = new ShopBuilding(false, true, false);
		
		//when
		maintenanceJanitorVisitor.visit(brokenShopBuilding);
		
		//then
		assertFalse(brokenShopBuilding.isDirty());
	}
}
