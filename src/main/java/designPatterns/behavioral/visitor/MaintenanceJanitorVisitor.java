package designPatterns.behavioral.visitor;

import designPatterns.behavioral.visitor.buildings.ProductionBuilding;
import designPatterns.behavioral.visitor.buildings.ResearchBuilding;
import designPatterns.behavioral.visitor.buildings.ShopBuilding;

public class MaintenanceJanitorVisitor implements JanitorVisitor {
	public void visit(ProductionBuilding building) {
		building.setBroken(false);
	}
	
	public void visit(ResearchBuilding building) {
		if(!building.isDirty())
			building.setBroken(false);
	}
	
	public void visit(ShopBuilding building) {
		building.setBroken(false);
	}
}
