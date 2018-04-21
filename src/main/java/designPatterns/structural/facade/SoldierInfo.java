package designPatterns.structural.facade;

public class SoldierInfo {
	private int soldierNumber;
	private String standardWeapon;
	private boolean squadReadyToBattle;
	
	public SoldierInfo(int soldierNumber, String standardWeapon, boolean squadReadyToBattle) {
		this.soldierNumber = soldierNumber;
		this.standardWeapon = standardWeapon;
		this.squadReadyToBattle = squadReadyToBattle;
	}

	public int getSoldierNumber() {
		return soldierNumber;
	}

	public String getStandardWeapon() {
		return standardWeapon;
	}

	public boolean isSquadReadyToBattle() {
		return squadReadyToBattle;
	}

}
