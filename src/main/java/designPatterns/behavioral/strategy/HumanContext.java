package designPatterns.behavioral.strategy;

/*
 * Strategy context class
 */
public class HumanContext {
	private int power;
	
	public HumanContext(int power) {
		this.power = power;
	}

	public void doAction(ActionStrategy actionStrategy){
		power = actionStrategy.executeAction(power);
	}

	public int getPower() {
		return power;
	}
}
