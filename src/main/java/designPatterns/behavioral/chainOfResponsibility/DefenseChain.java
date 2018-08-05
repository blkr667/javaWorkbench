package designPatterns.behavioral.chainOfResponsibility;

public interface DefenseChain {
	void setNextChain(DefenseChain nextDefenseChain);
	Defenders getDefenders(int enemyNumber);
}
