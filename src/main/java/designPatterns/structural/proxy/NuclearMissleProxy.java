package designPatterns.structural.proxy;

/*
 * Wrapper for object with same interface:
 * 	- Create access control at method invocation
 *  - Lazy loading - create object at method invocation for performance improvement
 */
public class NuclearMissleProxy implements Missle {

	@Override
	public LaunchResult launchMissle(MissleAdministrator administrator) {
		if(administrator.getAccessRight() != MissleAccessRight.FULL) {
			return LaunchResult.SUSPENDED;
		}
		return new NuclearMissle().launchMissle(administrator);
	}

}
