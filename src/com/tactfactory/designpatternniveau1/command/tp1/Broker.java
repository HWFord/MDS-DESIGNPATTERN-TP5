package com.tactfactory.designpatternniveau1.command.tp1;

import java.util.ArrayList;

public class Broker {

	private ArrayList<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() throws CloneNotSupportedException {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}

}

//invoker
//invoker cours

//private Stack<Order> history = new Stack<>();
//
//
// public void push(Order c) {
//      history.push(c);
// }
//
// public Order pop() {
//      return history.pop();
// }
//
// public boolean isEmpty() { return history.isEmpty(); }
//
// public void showHistory() {
//   System.out.println("Invoker history");
//   for (Order order : history) {
//      System.out.println(order);
//   }
// }
//
//public List<Stock> getStocks() {
//	return stocks;
//}
