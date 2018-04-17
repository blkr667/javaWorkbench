package designPatterns.behavioral.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StrongholdTest {
	private Stronghold stronghold;
	private Guard firstGuard;
	private Guard secondGuard;
	
	@Before
	public void setUp() {
		stronghold = new Stronghold(StrongholdState.NO_GUESTS);
		firstGuard = new Guard(1, GuardLocation.CANTEEN);
		secondGuard = new Guard(2, GuardLocation.CANTEEN);
	}
	
	@Test 
	public void shoulNotifyGuards_whenEnemiesAtStronghold() {
		// given
		stronghold.register(firstGuard);
		stronghold.register(secondGuard);
		
		// when
		stronghold.setStrongholdState(StrongholdState.ENEMIES);
		
		// then
		assertEquals(GuardLocation.GUARD_POST, firstGuard.getGuardLocation());
		assertEquals(GuardLocation.GUARD_POST, secondGuard.getGuardLocation());
	}
	
	@Test 
	public void shoulNotNotifyGuards_whenNoDanger() {
		// given
		stronghold.register(firstGuard);
		stronghold.register(secondGuard);
		
		// when
		stronghold.setStrongholdState(StrongholdState.TRADERS);
		
		// then
		assertEquals(GuardLocation.CANTEEN, firstGuard.getGuardLocation());
		assertEquals(GuardLocation.CANTEEN, secondGuard.getGuardLocation());
	}

}
