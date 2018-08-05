package designPatterns.structural.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FighterTest {
	@Test 
	public void shouldF16FighterGetMachineGun_whenStandardWeaponApplied() {
		Weapon machineGun = new StandardWeapon();
		Fighter f16 = new F16Fighter(machineGun);
		
		f16.applyWeapon();
		
		assertEquals(FighterStatus.ARMORED_WITH_MACHINE_GUN, f16.getFighterStatus());
	}
	
	@Test 
	public void shouldTieFighterGetLaserGun_whenLaserWeaponApplied() {
		Weapon laserWeapon = new LaserWeapon();
		Fighter tie = new TieFighter(laserWeapon);
		
		tie.applyWeapon();
		
		assertEquals(FighterStatus.ARMORED_WITH_LASER, tie.getFighterStatus());
	}
	
	
}
