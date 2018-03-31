package design_patterns.structural.composite;

import java.util.List;

public interface OrcUnit {
	int getAttackPower();
	int getGroupAttackPower();
	void addSubordinateUnit(OrcUnit unit);
	List<OrcUnit> getSubordinateUnits();
}
