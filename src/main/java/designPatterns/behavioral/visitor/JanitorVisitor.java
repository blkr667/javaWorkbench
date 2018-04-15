package designPatterns.behavioral.visitor;

import designPatterns.behavioral.visitor.buildings.ProductionBuilding;
/*
 * Visitor Design Patern:
 * - visitor have implementation of same method for all visitable types
 * - visitable classes have accept method that invoke Visitor visit method
 * - visitable classes can be extended by new functions without implementation change, by adding new visitors
 */
import designPatterns.behavioral.visitor.buildings.ResearchBuilding;
import designPatterns.behavioral.visitor.buildings.ShopBuilding;

public interface JanitorVisitor {
	void visit(ProductionBuilding building);
	void visit(ResearchBuilding building);
	void visit(ShopBuilding building);
}
