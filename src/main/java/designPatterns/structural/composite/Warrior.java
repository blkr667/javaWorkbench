package designPatterns.structural.composite;

import java.util.Collections;
import java.util.List;

public class Warrior implements OrcUnit {
	private int attackPower;

	public Warrior(String name, int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public int getAttackPower() {
		return attackPower;
	}

	@Override
	public int getGroupAttackPower() {
		return attackPower;
	}

	@Override
	public void addSubordinateUnit(OrcUnit unit) {
		throw new IllegalStateException("Warrior can not have subordinate units");
		
	}

	@Override
	public List<OrcUnit> getSubordinateUnits() {
		return Collections.emptyList();
	}
}
