package designPatterns.behavioral.command;

public class SendStrongholdSoldiersToWarCommand implements Command {
	private Stronghold stronghold;

	public SendStrongholdSoldiersToWarCommand(Stronghold stronghold) {
		this.stronghold = stronghold;
	}

	@Override
	public void execute() {
		stronghold.sendSoldiersToWar();
	}			
}
