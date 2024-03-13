package com.modelclass;

public class Employee {
	private int id;
	private String name;
	private int fees;
	
public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, int fees) {
	super();
	this.id = id;
	this.name = name;
	this.fees = fees;
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

public int getFees() {
	return fees;
}

public void setFees(int fees) {
	this.fees = fees;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", fees=" + fees + "]";
}

}
