package com.tactfactory.designpatternniveau1.command.tp1;

public class Stock implements Cloneable {
	public String name;
	public int quantity;
	public GlobalStock stockList;

	public Stock() {

	}

	public Stock(String name) {
		this.name = name;
		this.quantity = 0;
	}

	public Stock(String name, int quantity, GlobalStock stockList) {
		this.name = name;
		this.quantity = quantity;
		this.stockList = stockList;
	}

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", quantity=" + quantity + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Stock result = new Stock();
		result.setname(this.getName());
		result.setQuantity(this.getQuantity());
		return result;
	}

	public void buy() {
		System.out.println("Stock [name=" + name + ", quantity=" + quantity + "] bought");
	}

	public void sell() {
		System.out.println("Stock [name=" + name + ", quantity=" + quantity + "] sold");
	}

}
//Reciever
//achat()
//vente()