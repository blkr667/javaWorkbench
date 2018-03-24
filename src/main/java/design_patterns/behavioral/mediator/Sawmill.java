package design_patterns.behavioral.mediator;

public class Sawmill implements Storehouse {
	private int treeLogs = 0;
	
	public void storeGoods() {
		treeLogs++;
	}
	
	public int getGoodsNumber() {
		return treeLogs;
	}
}
