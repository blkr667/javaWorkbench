package designPatterns.behavioral.visitor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import designPatterns.behavioral.visitor.buildings.ProductionBuilding;
import designPatterns.behavioral.visitor.buildings.ResearchBuilding;
import designPatterns.behavioral.visitor.buildings.ShopBuilding;

public class CleaningJanitorVisitorTest {
	private CleaningJanitorVisitor cleaningJanitorVisitor;
	@Before
	public void setUp() {
		cleaningJanitorVisitor = new CleaningJanitorVisitor();
	}
	
	@Test 
	public void shouldCleanProductionBuilding() {
		//given
		ProductionBuilding dirtyProductionBuilding = new ProductionBuilding(true, false);
		
		//when
		cleaningJanitorVisitor.visit(dirtyProductionBuilding);
		
		//then
		assertFalse(dirtyProductionBuilding.isDirty());
	}
	
	@Test 
	public void shouldCleanResearchBuilding() {
		//given
		ResearchBuilding dirtyResearchBuilding = new ResearchBuilding(true, false, 2);
		
		//when
		cleaningJanitorVisitor.visit(dirtyResearchBuilding);
		
		//then
		assertFalse(dirtyResearchBuilding.isDirty());
	}
	
	@Test 
	public void shouldNotCleanResearchBuilding_whenTopSecretResearch() {
		//given
		int topSecretResearchLevel = 10;
		ResearchBuilding dirtyResearchBuilding = new ResearchBuilding(true, false, topSecretResearchLevel);
		
		//when
		cleaningJanitorVisitor.visit(dirtyResearchBuilding);
		
		//then
		assertTrue(dirtyResearchBuilding.isDirty());
	}
	
	@Test 
	public void shouldCleanShopBuilding() {
		//given
		ShopBuilding dirtyShopBuilding = new ShopBuilding(true, false, false);
		
		//when
		cleaningJanitorVisitor.visit(dirtyShopBuilding);
		
		//then
		assertFalse(dirtyShopBuilding.isDirty());
	}
	
	@Test 
	public void shouldNotCleanShopBuilding_whenCustomersInside() {
		//given
		boolean shopContainsCustomers = true;
		ShopBuilding dirtyShopBuilding = new ShopBuilding(true, false, shopContainsCustomers);
		
		//when
		cleaningJanitorVisitor.visit(dirtyShopBuilding);
		
		//then
		assertTrue(dirtyShopBuilding.isDirty());
	}
}
