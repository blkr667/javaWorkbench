package design_patterns.behavioral.strategy;

public class SleepAction implements ActionStrategy {

	private final static int PEACEFUL_SLEEP_POWER = 2;
	
	@Override
	public int executeAction(int currentPower) {
		return currentPower + PEACEFUL_SLEEP_POWER;
	}
}
