package design_patterns.structural.proxy;

public class NuclearMissle implements Missle {
	private final int destructionZoneDiameter;
	
	public NuclearMissle() {
		// expensive destruction zone diameter calculations
		destructionZoneDiameter = 5; 
	}

	@Override
	public LaunchResult launchMissle(MissleAdministrator administrator) {
		System.out.println(destructionZoneDiameter + " km zone destroyed by " + administrator.getName());
		return LaunchResult.LAUNCHED;
	}

}
