package designPatterns.behavioral.chainOfResponsibility;

public class GuardDefenseChain implements DefenseChain {
	private DefenseChain nextDefenseChain;
	
	@Override
	public void setNextChain(DefenseChain nextDefenseChain) {
		this.nextDefenseChain = nextDefenseChain;
	}

	@Override
	public Defenders getDefenders(int enemyNumber) {
		if (enemyNumber < 5)
			return Defenders.GUARDS;
		return nextDefenseChain.getDefenders(enemyNumber);
	}

}
