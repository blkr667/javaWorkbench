package designPatterns.behavioral.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HireSoldierToStrongholdCommandTest {
	@Test
	public void shouldSetSoldiersToZero_whenSoldiersSentToWar() {
		// given
		Stronghold stronghold = new Stronghold(10);
		SendStrongholdSoldiersToWarCommand command = new SendStrongholdSoldiersToWarCommand(stronghold);
	
		// when
		command.execute();
		
		//then
		assertEquals(0, stronghold.getSoldiersNumber());
	}
}
