package designPatterns.behavioral.command;

public class Stronghold {
	private int soldiersNumber;

	public Stronghold(int soldiersNumber) {
		this.soldiersNumber = soldiersNumber;
	}
	
	public void hireSoldier() {
		this.soldiersNumber++;
	}
	
	public void sendSoldiersToWar() {
		this.soldiersNumber = 0;
	}
	
	public int getSoldiersNumber() {
		return soldiersNumber;
	}
}
