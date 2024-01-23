package com.practice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Practice;

@Repository
public interface PracticeReop extends JpaRepository<Practice,Integer> {

}
