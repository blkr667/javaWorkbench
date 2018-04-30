package designPatterns.behavioral.command;

public class HireSoldierToStrongholdCommand implements Command {
	private Stronghold stronghold;

	public HireSoldierToStrongholdCommand(Stronghold stronghold) {
		this.stronghold = stronghold;
	}

	@Override
	public void execute() {
		stronghold.hireSoldier();
	}			
}
