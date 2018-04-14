package designPatterns.behavioral.memento;

public class PlayerUnit {
	private PlayerState state;
	private PlayerMemento memento;

	public void saveState() {
		memento = new PlayerMemento(state);
	}
	
	public void loadState() {
		if(memento != null) {
			state = memento.getLastState();
		}
	}
	
	public PlayerState getState() {
		return state;
	}

	public void setState(PlayerState state) {
		this.state = state;
	}
}
