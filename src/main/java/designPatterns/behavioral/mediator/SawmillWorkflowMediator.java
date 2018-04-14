package designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/*
 *	Mediator Pattern:
 *	- Communication with different classes handled by separate Mediator class
 */

public class SawmillWorkflowMediator implements WorkflowMediator {
	private List<Worker> lumberjacks = new ArrayList<>();
	private final Sawmill sawmill;

	
	public SawmillWorkflowMediator(Sawmill sawmill) {
		this.sawmill = sawmill;
	}
	
	@Override
	public void addWorkers(Worker... newLumberjacks) {
		for(Worker lumberjack : newLumberjacks)
			lumberjacks.add(lumberjack);
	}
	
	@Override
	public void sendWorksersToWork() {
		for(Worker lumberjack : lumberjacks) {
			lumberjack.goToWork();
		}
	}

	@Override
	public void storeGoodsAtStorehouse() {
		sawmill.storeGoods();
	}

}
