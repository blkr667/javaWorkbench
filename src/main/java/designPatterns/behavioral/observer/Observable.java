package designPatterns.behavioral.observer;

public interface Observable {
	void register(Observer observer);
	void unregister(int observerId);
	void notifyObservers();
}
