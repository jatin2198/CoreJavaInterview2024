package com.practice.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.practice.entity.Practice;

@Service
public class PracticeServiceImpl implements PracticeService {
	@Autowired
	PracticeReop practiceReop;
	
	@Override
	public Practice createPrac(Practice practice) {
		// TODO Auto-generated method stub
		return practiceReop.save(practice);
	}

	@Override
	public List<Practice> getAll() {
		// TODO Auto-generated method stub
		return practiceReop.findAll();
	}
	
	

}
