package com.tactfactory.designpatternniveau1.command.tp1;

import java.util.ArrayList;
import java.util.List;

public class GlobalStock {
	public List<Stock> stocks = new ArrayList<>();

	public void Buy(Stock stock) {
		for (Stock stockItem : stocks) {
			if (stockItem.getName().equals(stock.getName())) {
				stockItem.setQuantity(stockItem.getQuantity() + stock.getQuantity());
				break;
			}
		}
	}

	public void Sell(Stock stock) {
		for (Stock stockItem : stocks) {
			if (stockItem.getName().equals(stock.getName())) {
				stockItem.setQuantity(stockItem.getQuantity() - stock.getQuantity());
				break;
			}
		}
	}

	public void PrintStock() {
		for (Stock stock : stocks) {
			System.out.println(stock.toString());
		}
	}
}

//client
//list de stock pour config,obj myitme, apple et pineapple
//for each if check item exists in stock list in globalstock
//public Object stocks;
//
//	public ArrayList<Stock> stocks = new ArrayList<Stock>();
//	private Stack<Stock> history = new Stack<>();
//	private Broker broker = new Broker();
//
//	public void PrintStock() {
//		getGlobalStocks().toString();
//	}
//
//	public List<Stock> getGlobalStocks() {
//		return getGlobalStocks();
//	}
//
//	@Override
//	public String toString() {
//		return "" + getGlobalStocks();
//	}
//
//
//	public void executeCommand(Stock stock) throws CloneNotSupportedException {
//	    if (stock.execute()) {
//	      this.history.push(stock);
//	    }
//	  }
//
//	public void add(Stock stock) {
//
//	}
//
//	public void showHistory() {
//		this.broker.showHistory();
//	}
