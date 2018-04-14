package designPatterns.behavioral.state.states;

public class RepairingModeState implements SCVState {

	@Override
	public String doAction() {
		return "repairing";
	}

}
