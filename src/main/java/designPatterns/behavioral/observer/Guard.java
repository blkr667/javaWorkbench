package designPatterns.behavioral.observer;

public class Guard implements Observer {
	private int id;
	private GuardLocation location;
	
	public Guard(int id, GuardLocation location) {
		this.id = id;
		this.location = location;
	}

	@Override
	public int getId() {
		return id;
	}
	
	public GuardLocation getGuardLocation() {
		return location;
	}

	@Override
	public void answerToNotification() {
		location = GuardLocation.GUARD_POST;
	}

}
