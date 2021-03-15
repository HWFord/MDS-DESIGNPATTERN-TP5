package com.tactfactory.designpatternniveau1.command.tp1;

public class SellStock implements Order {

	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() throws CloneNotSupportedException {
		stock.sell();
	}

}
