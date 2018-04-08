package design_patterns.structural.proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NuclearMissleProxyTest {
	private NuclearMissleProxy missleProxy;
	
	@Before
	public void setUp() {
		missleProxy = new NuclearMissleProxy();
	}
	
	
	@Test 
	public void shouldSuspendLaunchingMissle_whenAdministratorWithDefaultAccessRights() {
		//given
		MissleAdministrator administrator = new MissleAdministrator("John", MissleAccessRight.DEFAULT);
		
		//when
		LaunchResult result = missleProxy.launchMissle(administrator);
		
		//then
		assertEquals(LaunchResult.SUSPENDED, result);
	}
	
	@Test 
	public void shouldRenderConvoyMembersWithOptimization_whenDuplicatedTypes() {
		//given
		MissleAdministrator administrator = new MissleAdministrator("John", MissleAccessRight.FULL);
		
		//when
		LaunchResult result = missleProxy.launchMissle(administrator);
		
		//then
		assertEquals(LaunchResult.LAUNCHED, result);
	}
}
