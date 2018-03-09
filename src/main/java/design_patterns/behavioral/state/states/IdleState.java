package design_patterns.behavioral.state.states;

public class IdleState implements SCVState {

	@Override
	public String doAction() {
		return "idle";
	}

}
