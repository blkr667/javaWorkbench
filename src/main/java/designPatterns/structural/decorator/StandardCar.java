package designPatterns.structural.decorator;

public class StandardCar implements Car {
	private String driveType;
	public StandardCar(String driveType) {
		this.driveType = driveType;
	}
	
	@Override
	public String drive() {
		return driveType;
	}
	
}
