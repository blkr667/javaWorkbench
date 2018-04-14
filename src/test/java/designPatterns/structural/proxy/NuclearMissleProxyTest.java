package designPatterns.structural.proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import designPatterns.structural.proxy.LaunchResult;
import designPatterns.structural.proxy.MissleAccessRight;
import designPatterns.structural.proxy.MissleAdministrator;
import designPatterns.structural.proxy.NuclearMissleProxy;

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
