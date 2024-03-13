package com.Model.servlet.Expressionlanguage;

public class Phone {
	private String name;
	private int price;
	private String color;
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	public Phone(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
	

}
