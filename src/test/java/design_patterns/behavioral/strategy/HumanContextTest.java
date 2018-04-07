package design_patterns.behavioral.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HumanContextTest {
	@Test 
	public void shouldIncreasePower_whenEatingActionStrategy() {
		//given
		ActionStrategy eatAction = new EatAction();
		HumanContext humanContext = new HumanContext(2);
		
		//when
		humanContext.doAction(eatAction);
		
		//then
		assertEquals(humanContext.getPower(), 3);

	}
	
	@Test 
	public void shouldIncreasePower_whenSleepingActionStrategy() {
		//given
		ActionStrategy sleepAction = new SleepAction();
		HumanContext humanContext = new HumanContext(2);
		
		//when
		humanContext.doAction(sleepAction);
		
		//then
		assertEquals(humanContext.getPower(), 4);
	}
	
	@Test 
	public void shouldDecreasePower_whenJumpingActionStrategy() {
		//given
		ActionStrategy jumpAction = new JumpAction();
		HumanContext humanContext = new HumanContext(3);
		
		//when
		humanContext.doAction(jumpAction);
		
		//then
		assertEquals(humanContext.getPower(), 1);
	}
	
	@Test(expected = IllegalStateException.class)  
	public void shouldThrowHumanDeadException_whenOverjumping() {
		//given
		ActionStrategy jumpAction = new JumpAction();
		HumanContext humanContext = new HumanContext(1);
		
		//when
		humanContext.doAction(jumpAction);
	}
}
