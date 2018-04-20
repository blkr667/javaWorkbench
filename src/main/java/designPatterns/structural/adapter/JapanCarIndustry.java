package designPatterns.structural.adapter;

import java.util.Arrays;
/*
 * Adaptee class
 */
public class JapanCarIndustry {
	public String[] produceCar(int amount) {
		String[] cars = new String[amount];
		Arrays.fill(cars, "car");
		return cars;
	}
}
