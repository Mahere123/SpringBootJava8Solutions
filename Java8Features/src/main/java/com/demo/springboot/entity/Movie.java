package com.demo.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Entity for Movie
 */
@Entity
@Table(name="Movie")
public class Movie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="MOVIEID",unique=true,nullable=false)
	private String movieId;
	
	@Column(name="MOVIENAME")
	private String movieName;
	
	@Column(name="DESC")
	private String desc;
	
	@OneToMany(mappedBy= "movie")
	private List<Rating> rating;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieId, String movieName, String desc, List<Rating> rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.desc = desc;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
	
	
}
