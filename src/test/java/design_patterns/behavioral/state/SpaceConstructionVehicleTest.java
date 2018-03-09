package design_patterns.behavioral.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import design_patterns.behavioral.state.states.ConstructingModeState;
import design_patterns.behavioral.state.states.IdleState;
import design_patterns.behavioral.state.states.RepairingModeState;


public class SpaceConstructionVehicleTest {

	private SpaceConstructionVehicle scv;

	@Before
	public void setUp() {
		scv = new SpaceConstructionVehicle();
	}
	
	@Test 
	public void shouldExecuteRepairingState() {
		// given
		scv.setState(new RepairingModeState());
		
		//when
		String resultAction = scv.doAction();
		
		//then
		assertEquals("repairing", resultAction);
	}
	
	@Test 
	public void shouldExecuteConstructingState() {
		// given
		scv.setState(new ConstructingModeState());
		
		//when
		String resultAction = scv.doAction();
		
		//then
		assertEquals("constructing", resultAction);
	}
	
	@Test 
	public void shouldExecuteIdleState() {
		// given
		scv.setState(new IdleState());
		
		//when
		String resultAction = scv.doAction();
		
		//then
		assertEquals("idle", resultAction);
	}
}
