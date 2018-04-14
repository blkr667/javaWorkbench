package designPatterns.creational.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import designPatterns.creational.builder.Gun;
import designPatterns.creational.builder.Ranger;
import designPatterns.creational.builder.RangerBuilder;

public class RangerBuilderTest {
	@Test 
	public void shouldCreateDefaultRanger_withBuilder() {
		//when
		Ranger resultRanger = new RangerBuilder().createRanger();
		
		//then
		assertEquals(resultRanger.getGun(), Gun.MP5);
		assertEquals(resultRanger.isBulletproofVest(), false);
		assertEquals(resultRanger.isNightVision(), false);

	}
	
	@Test 
	public void shouldCreateSpecialRanger_withBuilder() {
		//when
		Ranger resultRanger = new RangerBuilder()
				.addBulletproofVest()
				.addNightVision()
				.setGun(Gun.DESERT_EAGLE)
				.createRanger();
		
		//then
		assertEquals(resultRanger.getGun(), Gun.DESERT_EAGLE);
		assertEquals(resultRanger.isBulletproofVest(), true);
		assertEquals(resultRanger.isNightVision(), true);
	}
}
