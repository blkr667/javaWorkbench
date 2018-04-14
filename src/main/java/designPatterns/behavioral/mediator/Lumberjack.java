package designPatterns.behavioral.mediator;

public class Lumberjack implements Worker {
	private SawmillWorkflowMediator sawmillWorkflowMediator;

	public Lumberjack(SawmillWorkflowMediator sawmillWorkflowMediator) {
		this.sawmillWorkflowMediator = sawmillWorkflowMediator;
	}
	
	@Override
	public void goToWork() {
		sawmillWorkflowMediator.storeGoodsAtStorehouse();
	}
}
