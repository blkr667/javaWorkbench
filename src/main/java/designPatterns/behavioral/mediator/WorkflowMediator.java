package designPatterns.behavioral.mediator;

public interface WorkflowMediator {
	void sendWorksersToWork();
	void addWorkers(Worker...workers);
	void storeGoodsAtStorehouse();
}
