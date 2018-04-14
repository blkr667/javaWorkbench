package designPatterns.behavioral.mediator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import designPatterns.behavioral.mediator.Lumberjack;
import designPatterns.behavioral.mediator.Sawmill;
import designPatterns.behavioral.mediator.SawmillWorkflowMediator;

public class SawmillWorkflowMediatorTest {
	
	private Sawmill sawmill;
	private SawmillWorkflowMediator sawmillWorkflowMediator;
	
	@Before
	public void setUp() {
		sawmill = new Sawmill();
		sawmillWorkflowMediator = new SawmillWorkflowMediator(sawmill);
	}
	
	@Test
	public void shouldNotGetTreeLogs_whenNoWorkers() {
		// given
		sawmillWorkflowMediator.addWorkers();
		
		// when
		sawmillWorkflowMediator.sendWorksersToWork();
		
		// then
		assertEquals(0, sawmill.getGoodsNumber());
	}
	
	@Test
	public void shouldGetTreeLogs() {
		// given
		sawmillWorkflowMediator.addWorkers(
				new Lumberjack(sawmillWorkflowMediator),
				new Lumberjack(sawmillWorkflowMediator));
		
		// when
		sawmillWorkflowMediator.sendWorksersToWork();
		
		// then
		assertEquals(2, sawmill.getGoodsNumber());
	}
}
