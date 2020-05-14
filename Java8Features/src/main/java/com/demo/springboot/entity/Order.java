package com.demo.springboot.entity;

import java.util.List;

public class Order {

	private String name;
	
	private List<String> items;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String name, List<String> items) {
		super();
		this.name = name;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	

}
