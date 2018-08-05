package designPatterns.behavioral.chainOfResponsibility;

public class KnightDefenseChain implements DefenseChain {
	private DefenseChain nextDefenseChain;
	
	@Override
	public void setNextChain(DefenseChain nextDefenseChain) {
		this.nextDefenseChain = nextDefenseChain;
	}

	@Override
	public Defenders getDefenders(int enemyNumber) {
		return Defenders.KNIGHTS;
	}

}
