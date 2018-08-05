package designPatterns.behavioral.chainOfResponsibility;

public class SpearmanDefenseChain implements DefenseChain {
	private DefenseChain nextDefenseChain;
	
	@Override
	public void setNextChain(DefenseChain nextDefenseChain) {
		this.nextDefenseChain = nextDefenseChain;
	}

	@Override
	public Defenders getDefenders(int enemyNumber) {
		if (enemyNumber < 20)
			return Defenders.SPEARMANS;
		return nextDefenseChain.getDefenders(enemyNumber);
	}

}
