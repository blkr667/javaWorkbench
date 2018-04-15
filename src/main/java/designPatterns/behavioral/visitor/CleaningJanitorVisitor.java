package designPatterns.behavioral.visitor;

import designPatterns.behavioral.visitor.buildings.ProductionBuilding;
import designPatterns.behavioral.visitor.buildings.ResearchBuilding;
import designPatterns.behavioral.visitor.buildings.ShopBuilding;

public class CleaningJanitorVisitor implements JanitorVisitor {
	public void visit(ProductionBuilding building) {
		building.setDirty(false);
	}
	
	public void visit(ResearchBuilding building) {
		if(building.getTopSecetLevel() < 3)
			building.setDirty(false);
	}
	
	public void visit(ShopBuilding building) {
		if(!building.isContainsCustomers())
			building.setDirty(false);
	}
}
