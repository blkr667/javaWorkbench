package designPatterns.behavioral.state;

import designPatterns.behavioral.state.states.SCVState;

public class SpaceConstructionVehicle {
	private SCVState state;

	public String doAction() {
		return state.doAction();
	}

	public void setState(SCVState state) {
		this.state = state;
	}

}
