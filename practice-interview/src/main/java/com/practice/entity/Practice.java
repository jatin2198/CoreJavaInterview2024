package com.practice.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NonNull;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

import io.micrometer.common.lang.NonNullFields;
import jakarta.persistence.*;
@Entity
@Data
@Table(name="practice")
public class Practice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@Column(name = "Name" ,nullable = false)
	private  String name;
	
	private String desciption;
	
	private String subj;

}
