package designPatterns.structural.facade;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


public class MilitaryBaseFacadeTest {
	private MilitaryBaseFacade militaryBaseFacade;
	
	private MissleLauncher missleLauncher;
	private RadarInfoProvider radarInfoProvider;
	private SoldierInfoProvider soldierInfoProvider;
	
	@Before
	public void setUp() {
		missleLauncher = mock(MissleLauncher.class);
		radarInfoProvider = mock(RadarInfoProvider.class);
		soldierInfoProvider = mock(SoldierInfoProvider.class);
		militaryBaseFacade = new MilitaryBaseFacade(missleLauncher, radarInfoProvider, soldierInfoProvider);
	}
	
	@Test 
	public void shouldCheckIfEnemyIsNearby() {
		when(radarInfoProvider.isEnemyNearby()).thenReturn(true);
		
		boolean resultCheck = militaryBaseFacade.isEnemyNearby();
		
		assertTrue(resultCheck);
	}
	
	@Test 
	public void shouldLaunchMissleSuccesfully_whenSuccessfullSafetyCheck() {
		when(missleLauncher.isLaunchSafe()).thenReturn(true);
		
		militaryBaseFacade.launchMissleWithSafetyCheck();
		
		verify(missleLauncher).launch();
		verify(missleLauncher).isLaunchSafe();
	}
	
	@Test 
	public void shouldNotLaunchMissleSuccesfully_whenUnsuccessfullSafetyCheck() {
		when(missleLauncher.isLaunchSafe()).thenReturn(false);
		
		militaryBaseFacade.launchMissleWithSafetyCheck();
		
		verify(missleLauncher, never()).launch();
		verify(missleLauncher).isLaunchSafe();
	}
	
	@Test 
	public void shouldGetSoldierInfo() {
		when(soldierInfoProvider.getSoldiersNumber()).thenReturn(5);
		when(soldierInfoProvider.getStandardWeapon()).thenReturn("AK-47");
		when(soldierInfoProvider.isSquadReadyToBattle()).thenReturn(true);
		
		SoldierInfo soldierInfo = militaryBaseFacade.getSoldierInfo();
		
		assertEquals(5, soldierInfo.getSoldierNumber());
		assertEquals("AK-47", soldierInfo.getStandardWeapon());
		assertTrue(soldierInfo.isSquadReadyToBattle());
	}
}
