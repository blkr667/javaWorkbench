package designPatterns.behavioral.visitor.buildings;

import designPatterns.behavioral.visitor.JanitorVisitor;

public class ShopBuilding implements VisitableBuilding {
	private boolean dirty;
	private boolean broken;
	private boolean containsCustomers;
	
	public ShopBuilding(boolean dirty, boolean broken, boolean containsCustomers) {
		this.dirty = dirty;
		this.broken = broken;
		this.containsCustomers = containsCustomers;
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
	
	public boolean isContainsCustomers() {
		return containsCustomers;
	}

	@Override
	public void accept(JanitorVisitor visitor) {
		visitor.visit(this);
	}
	
	public void sellSomething( ) {
		
	}
}
