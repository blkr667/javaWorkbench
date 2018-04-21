package designPatterns.structural.facade;

public class MilitaryBaseFacade {
	private final MissleLauncher missleLauncher;
	private final RadarInfoProvider radarInfoProvider;
	private final SoldierInfoProvider soldierInfoProvider;
	
	public MilitaryBaseFacade(MissleLauncher missleLauncher, RadarInfoProvider radarInfoProvider,
			SoldierInfoProvider soldierInfoProvider) {
		this.missleLauncher = missleLauncher;
		this.radarInfoProvider = radarInfoProvider;
		this.soldierInfoProvider = soldierInfoProvider;
	}
	
	public boolean isEnemyNearby() {
		return radarInfoProvider.isEnemyNearby();
	}
	
	public void launchMissleWithSafetyCheck() {
		if(missleLauncher.isLaunchSafe())
			missleLauncher.launch();
	}
	
	public SoldierInfo getSoldierInfo() {
		return new SoldierInfo(
				soldierInfoProvider.getSoldiersNumber(), 
				soldierInfoProvider.getStandardWeapon(), 
				soldierInfoProvider.isSquadReadyToBattle());
	}
	

}
