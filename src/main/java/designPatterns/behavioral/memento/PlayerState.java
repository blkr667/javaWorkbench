package designPatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class PlayerState {
	private final int helathPoints;
	private final List<String> items = new ArrayList<>();
	
	public PlayerState(int helathPoints, List<String> items) {
		this.helathPoints = helathPoints;
		this.items.addAll(items);
	}

	public int getHelathPoints() {
		return helathPoints;
	}

	public List<String> getItems() {
		return items;
	}
	
}
