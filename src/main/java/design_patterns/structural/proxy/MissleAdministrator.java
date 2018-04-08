package design_patterns.structural.proxy;

public class MissleAdministrator {
	private String name;
	private MissleAccessRight accessRight;
	
	public MissleAdministrator(String name, MissleAccessRight accessRight) {
		this.name = name;
		this.accessRight = accessRight;
	}

	public String getName() {
		return name;
	}

	public MissleAccessRight getAccessRight() {
		return accessRight;
	}
}
