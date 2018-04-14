package designPatterns.structural.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import designPatterns.structural.composite.ClanLeader;
import designPatterns.structural.composite.Warchief;
import designPatterns.structural.composite.Warrior;

public class OrcUnitTest {
	@Test 
	public void shoultGetGroupAttackPower_forCleanLeader() {
		// given
		ClanLeader clanLeader = prepareClanLeaderWithSubordinateUnits("Thrall", 10, 2);
		
		//when
		int resultAttackPower = clanLeader.getGroupAttackPower();
		
		//then
		assertEquals(14, resultAttackPower);
	}
	
	@Test 
	public void shoultGetGroupAttackPower_forWarchief() {
		// given
		Warchief warchief = new Warchief("Guldan", 20);
		warchief.addSubordinateUnit(prepareClanLeaderWithSubordinateUnits("Thrall", 10, 2));
		warchief.addSubordinateUnit(prepareClanLeaderWithSubordinateUnits("Grom", 10, 2));
		
		//when
		int resultAttackPower = warchief.getGroupAttackPower();
		
		//then
		assertEquals(58, resultAttackPower);
	}
	
	private ClanLeader prepareClanLeaderWithSubordinateUnits(String leaderName, 
			int leaderAttackPower, int warriorsAttackPower) {
		ClanLeader clanLeader = new ClanLeader(leaderName, leaderAttackPower);
		clanLeader.addSubordinateUnit(new Warrior("nameless", warriorsAttackPower));
		clanLeader.addSubordinateUnit(new Warrior("nameless", warriorsAttackPower));
		return clanLeader;
	}
}
