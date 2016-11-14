package org.packt.Spring.JDBC.model;

public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		setId(id);
		setName(name);
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized String getName() {
 		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

}
