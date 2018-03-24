package design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConvoyFlyweightRenderer {
	private Map<UnitType, RenderableUnit> convoyRenderableUnits = new HashMap<>();
	private int renderedUnitsCount;

	public Map<UnitType, RenderableUnit> getConvoyMembers() {
		return convoyRenderableUnits;
	}
	
	public int getRenderedUnitsCount() {
		return renderedUnitsCount;
	}
	
	public void renderConvoyMember(int position, UnitType type) {
		if(convoyRenderableUnits.get(type) == null) {
			convoyRenderableUnits.put(type, new ConvoyMember(type));
		}
		convoyRenderableUnits.get(type).render(position);
		renderedUnitsCount++;
	}
}
