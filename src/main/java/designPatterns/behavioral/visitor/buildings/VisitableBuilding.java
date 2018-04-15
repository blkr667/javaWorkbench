package designPatterns.behavioral.visitor.buildings;

import designPatterns.behavioral.visitor.JanitorVisitor;

public interface VisitableBuilding {
	void accept(JanitorVisitor visitor);

}
