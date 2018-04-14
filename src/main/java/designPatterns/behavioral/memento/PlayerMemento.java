package designPatterns.behavioral.memento;

public class PlayerMemento {
	private final PlayerState state;
	
	public PlayerMemento(PlayerState state) {
		this.state = state;
	}

	public PlayerState getLastState() {
		return state;
	}
}
