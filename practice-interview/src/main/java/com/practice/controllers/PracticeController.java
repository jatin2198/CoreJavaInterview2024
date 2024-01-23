package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.data.PracticeServiceImpl;
import com.practice.entity.Practice;

@RestController
@RequestMapping("/")
public class PracticeController {

	@Autowired
	PracticeServiceImpl practiceServiceImpl;
	@PostMapping("create")
	public ResponseEntity createPractic(@RequestBody Practice pro ) {
	
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(practiceServiceImpl.createPrac(pro));
	}
}
