package designPatterns.behavioral.chainOfResponsibility;

public class DefenseHandler {
	private final DefenseChain defenseChain;
	
	public DefenseHandler() {
		defenseChain = new GuardDefenseChain();
		SpearmanDefenseChain spearmanDefenseChain = new SpearmanDefenseChain();
		defenseChain.setNextChain(spearmanDefenseChain);
		KnightDefenseChain knightDefenseChain = new KnightDefenseChain();
		spearmanDefenseChain.setNextChain(knightDefenseChain);

	}
	
	public Defenders getDefenders(int enemyNumber) {
		return defenseChain.getDefenders(enemyNumber);
	}
}
