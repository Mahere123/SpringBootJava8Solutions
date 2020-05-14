package com.demo.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.dto.RatingResponseDTO;
import com.demo.springboot.entity.Movie;
@Repository
public interface RatingRepository extends JpaRepository<Movie,String> {

	RatingResponseDTO save(RatingResponseDTO ratingResponseDTO);

}
