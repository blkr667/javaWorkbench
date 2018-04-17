package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Stronghold implements Observable{
	private StrongholdState state;
	private List<Observer> guards = new ArrayList<>();
	
	public Stronghold(StrongholdState state) {
		this.state = state;
	}

	@Override
	public void register(Observer observer) {
		guards.add(observer);
		
	}

	@Override
	public void unregister(int observerId) {
		guards.removeIf(observer -> observer.getId() == observerId);
		
	}

	@Override
	public void notifyObservers() {
		if(state == StrongholdState.ENEMIES) {
			guards.forEach(guard -> guard.answerToNotification());
		}
	}
	
	public void setStrongholdState(StrongholdState state) {
		this.state = state;
		notifyObservers();
	}

}
