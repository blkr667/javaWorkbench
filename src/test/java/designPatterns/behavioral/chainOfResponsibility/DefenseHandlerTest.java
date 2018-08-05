package designPatterns.behavioral.chainOfResponsibility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DefenseHandlerTest {
	private DefenseHandler defenseHandler;
	
	@Before
	public void setUp() {
		defenseHandler = new DefenseHandler();
	}
	
	
	@Test
	public void shouldReturnGuardDefenders_whenSmallNumberOfEnemies() {
		// when
		Defenders resultDefenders = defenseHandler.getDefenders(3);
		
		//then
		assertEquals(Defenders.GUARDS, resultDefenders);
	}
	
	@Test
	public void shouldReturnSpearmanDefenders_whenMediumNumberOfEnemies() {
		// when
		Defenders resultDefenders = defenseHandler.getDefenders(12);
		
		//then
		assertEquals(Defenders.SPEARMANS, resultDefenders);
	}
	
	@Test
	public void shouldReturnKnightDefenders_whenLArgeNumberOfEnemies() {
		// when
		Defenders resultDefenders = defenseHandler.getDefenders(666);
		
		//then
		assertEquals(Defenders.KNIGHTS, resultDefenders);
	}
}
