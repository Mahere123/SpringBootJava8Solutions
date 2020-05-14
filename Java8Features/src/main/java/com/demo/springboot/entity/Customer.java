package com.demo.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Entity for Customer
 */
@Entity
@Table(name="Customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CUSTOMERID",unique=true,nullable=false)
	private String customerId;
	
	@OneToMany(mappedBy= "customer")
	private List<Rating> rating;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, List<Rating> rating) {
		super();
		this.customerId = customerId;
		this.rating = rating;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
	
	
	
	
	

}
