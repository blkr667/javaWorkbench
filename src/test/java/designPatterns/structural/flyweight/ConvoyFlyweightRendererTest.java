package designPatterns.structural.flyweight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import designPatterns.structural.flyweight.ConvoyFlyweightRenderer;
import designPatterns.structural.flyweight.UnitType;

public class ConvoyFlyweightRendererTest {
	private ConvoyFlyweightRenderer convoyFlyweightRenderer;
	
	@Before
	public void setUp() {
		convoyFlyweightRenderer = new ConvoyFlyweightRenderer();
	}
	
	
	@Test 
	public void shouldRenderSingleConvoyMember() {
		//when
		convoyFlyweightRenderer.renderConvoyMember(1, UnitType.CAR);
		
		//then
		assertEquals(1, convoyFlyweightRenderer.getConvoyMembers().size());
		assertNotNull(convoyFlyweightRenderer.getConvoyMembers().get(UnitType.CAR));
		assertEquals(1, convoyFlyweightRenderer.getRenderedUnitsCount());
	}
	
	@Test 
	public void shouldRenderConvoyMembersWithOptimization_whenDuplicatedTypes() {
		//given
		UnitType[] convoyToRender = {
				UnitType.CAR, UnitType.TANK, UnitType.BIKE,
				UnitType.CAR, UnitType.TANK, UnitType.BIKE,
				UnitType.CAR, UnitType.TANK, UnitType.BIKE};
		
		//when
		for(int position = 0; position < convoyToRender.length; position++) {
			convoyFlyweightRenderer.renderConvoyMember(position, convoyToRender[position]);
		}
		
		//then
		assertEquals(3, convoyFlyweightRenderer.getConvoyMembers().size());
		assertEquals(9, convoyFlyweightRenderer.getRenderedUnitsCount());
	}
}
