package design_patterns.structural.flyweight;

public class ConvoyMember implements RenderableUnit {
	private UnitType unitType;
	
	public ConvoyMember(UnitType unitType) {
		this.unitType = unitType;
	}
	
	public UnitType getUnitType() {
		return unitType;
	}
	

	@Override
	public void render(int position) {
		// render unitType at position
	}

}
