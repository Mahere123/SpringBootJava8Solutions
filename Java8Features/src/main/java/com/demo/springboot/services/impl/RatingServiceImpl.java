package com.demo.springboot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.dto.RatingResponseDTO;
import com.demo.springboot.respository.RatingRepository;
import com.demo.springboot.services.RatingService;
@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public RatingResponseDTO save(RatingResponseDTO ratingResponseDTO) {
		// TODO Auto-generated method stub
		return ratingRepository.save(ratingResponseDTO);
	}

}
