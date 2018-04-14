package designPatterns.creational.factory;

import designPatterns.creational.factory.troopers.DeathTrooper;
import designPatterns.creational.factory.troopers.SnowTrooper;
import designPatterns.creational.factory.troopers.StormTrooper;
import designPatterns.creational.factory.troopers.Trooper;

public class TrooperFactory {
	public Trooper createTrooper(TrooperType type) {
		if(type.equals(TrooperType.STORM_TROOPER)) {
			return new StormTrooper();
		} else if(type.equals(TrooperType.SNOW_TROOPER)) {
			return new SnowTrooper();
		} else if(type.equals(TrooperType.DEATH_TROOPER)) {
			return new DeathTrooper();
		}
		
		throw new IllegalArgumentException("Troper type " + type.name() + " is not supported");
	}
}
