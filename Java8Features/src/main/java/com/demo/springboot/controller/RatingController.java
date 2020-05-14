package com.demo.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.dto.RatingResponseDTO;
import com.demo.springboot.services.RatingService;

@RestController
@RequestMapping("/path/api")
public class RatingController {
	 private final Logger log=LoggerFactory.getLogger(RatingController.class);
	 
	 @Autowired
	 private RatingService  ratingService;
	 
	 @PostMapping("rest/customer/customerid/rate/rating")
	 public RatingResponseDTO save(@RequestBody RatingResponseDTO ratingResponseDTO)
	 {
		log.info("Rest Request to save  rating details");
		
		return ratingService.save(ratingResponseDTO);
	 }
	 

}
