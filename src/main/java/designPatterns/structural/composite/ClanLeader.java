package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ClanLeader implements OrcUnit {
	private int attackPower;
	private List<OrcUnit> subordinateUnits = new ArrayList<>();

	public ClanLeader(String name, int attackPower) {
		this.attackPower = attackPower;
	}

	@Override
	public int getAttackPower() {
		return attackPower;
	}

	@Override
	public int getGroupAttackPower() {
		return getAttackPower() + 
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
