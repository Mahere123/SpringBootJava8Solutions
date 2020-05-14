package com.demo.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Entity for Rating
 */
@Entity
@Table(name="Rating")
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="RATINGID",unique=true,nullable=false)
	private String ratingId;
	
	@Column(name="RATING")
	private int rating;
	
	@ManyToOne
	@JoinColumn(name="MOVIEID",nullable=false)
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMERID",nullable=false)
	private Customer customer;

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String ratingId, int rating, Movie movie, Customer customer) {
		super();
		this.ratingId = ratingId;
		this.rating = rating;
		this.movie = movie;
		this.customer = customer;
	}

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
