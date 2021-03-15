package com.tactfactory.designpatternniveau1.command.tp1;

public class BuyStock implements Order {

	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() throws CloneNotSupportedException {
		stock.buy();
	}

}
