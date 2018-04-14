package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Warchief implements OrcUnit {
	private int attackPower;
	private int WARCHIEF_MORALE_BOOSTER = 10;
	private List<OrcUnit> subordinateUnits = new ArrayList<>();

	public Warchief(String name, int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public int getAttackPower() {
		return attackPower;
	}

	@Override
	public int getGroupAttackPower() {
		return getAttackPower() + 
				WARCHIEF_MORALE_BOOSTER + 
				subordinateUnits.stream().mapToInt(unit -> unit.getGroupAttackPower()).sum();
	}

	@Override
	public void addSubordinateUnit(OrcUnit unit) {
		subordinateUnits.add(unit);
	}

	@Override
	public List<OrcUnit> getSubordinateUnits() {
		return subordinateUnits;
	}

}
