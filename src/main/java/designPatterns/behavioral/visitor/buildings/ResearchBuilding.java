package designPatterns.behavioral.visitor.buildings;

import designPatterns.behavioral.visitor.JanitorVisitor;

public class ResearchBuilding implements VisitableBuilding {
	private boolean dirty;
	private boolean broken;
	private int topSecetLevel;
	
	public ResearchBuilding(boolean dirty, boolean broken, int topSecetLevel) {
		this.dirty = dirty;
		this.broken = broken;
		this.topSecetLevel = topSecetLevel;
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

	public int getTopSecetLevel() {
		return topSecetLevel;
	}

	public void setTopSecetLevel(int topSecetLevel) {
		this.topSecetLevel = topSecetLevel;
	}

	@Override
	public void accept(JanitorVisitor visitor) {
		visitor.visit(this);
	}
	
	public void doResearch() {
		
	}

}
