package design_patterns.behavioral.strategy;

public class EatAction implements ActionStrategy {

	private final static int FOOD_POWER = 1;
	
	@Override
	public int executeAction(int currentPower) {
		return currentPower + FOOD_POWER;
	}
}
