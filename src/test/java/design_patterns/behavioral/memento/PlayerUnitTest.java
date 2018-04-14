package design_patterns.behavioral.memento;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class PlayerUnitTest {
	private PlayerUnit playerUnit;
	
	@Before
	public void setUp() {
		playerUnit = new PlayerUnit();
	}
	
	@Test 
	public void shoulLoadState_whenSavedStateExists() {
		// given
		playerUnit.setState(new PlayerState(10, Arrays.asList("knife")));
		playerUnit.saveState();
		playerUnit.setState(new PlayerState(4, Arrays.asList("shovel")));
		
		//when
		playerUnit.loadState();
		
		//then
		assertEquals(10, playerUnit.getState().getHelathPoints());
		assertEquals(1, playerUnit.getState().getItems().size());
		assertEquals("knife", playerUnit.getState().getItems().get(0));
	}
	
	@Test 
	public void shoulNotFail_whenSavedStateNotExists() {
		// given
		playerUnit.setState(new PlayerState(10, Arrays.asList("knife")));
		
		//when
		playerUnit.loadState();
		
		//then
		assertEquals(10, playerUnit.getState().getHelathPoints());
		assertEquals(1, playerUnit.getState().getItems().size());
		assertEquals("knife", playerUnit.getState().getItems().get(0));
	}
}
