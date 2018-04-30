package designPatterns.behavioral.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SendStrongholdSoldiersToWarCommandTest {
	@Test
	public void shouldIncrementSoldierNumber_whenHireSoldier() {
		// given
		Stronghold stronghold = new Stronghold(10);
		HireSoldierToStrongholdCommand command = new HireSoldierToStrongholdCommand(stronghold);
	
		// when
		command.execute();
		
		//then
		assertEquals(11, stronghold.getSoldiersNumber());
	}
}
