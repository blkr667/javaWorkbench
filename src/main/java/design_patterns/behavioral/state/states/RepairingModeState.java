package design_patterns.behavioral.state.states;

public class RepairingModeState implements SCVState {

	@Override
	public String doAction() {
		return "repairing";
	}

}
