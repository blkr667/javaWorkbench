package design_patterns.structural.decorator;

/*
 * Decorator class
 */
public class ArmoredCar implements Car {
	private Car car;
	
	public ArmoredCar(Car car) {
		this.car = car;
	}

	@Override
	public String drive() {
		return car.drive() + " but safe";
	}

}
