package designPatterns.behavioral.visitor.buildings;

import designPatterns.behavioral.visitor.JanitorVisitor;

public class ProductionBuilding implements VisitableBuilding {
	private boolean dirty;
	private boolean broken;
	
	public ProductionBuilding(boolean dirty, boolean broken) {
		this.dirty = dirty;
		this.broken = broken;
	}
	
	public boolean isDirty() {
		return dirty;
	}

	public boolean isBroken() {
		return broken;
	}
	
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}

	@Override
	public void accept(JanitorVisitor visitor) {
		visitor.visit(this);
	}
	
	public void produceStuff() {
		
	}

}
