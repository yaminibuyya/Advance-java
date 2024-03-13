package com.model;

public class Fruit {
	private int id;
	private String name;
	private String color;
	private double price;
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	

}
