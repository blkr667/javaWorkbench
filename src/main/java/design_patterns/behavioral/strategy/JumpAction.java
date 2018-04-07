package design_patterns.behavioral.strategy;

public class JumpAction implements ActionStrategy {

	private final static int JUMPING_POWER_REDUCTION = 2;
	
	@Override
	public int executeAction(int currentPower) {
		currentPower -= JUMPING_POWER_REDUCTION;
		
		if(currentPower <= 0) {
			throw new IllegalStateException("Death from overjumping");
		}
		return currentPower;
	}
}
