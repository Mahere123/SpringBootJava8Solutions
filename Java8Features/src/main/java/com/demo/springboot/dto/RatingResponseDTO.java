package com.demo.springboot.dto;

public class RatingResponseDTO {
	
	private String customerId;
	
	private String rating;
	
	private String movieId;

	public RatingResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RatingResponseDTO(String customerId, String rating, String movieId) {
		super();
		this.customerId = customerId;
		this.rating = rating;
		this.movieId = movieId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
}
