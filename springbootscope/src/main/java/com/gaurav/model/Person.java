package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import lombok.Data;

@Data
@Table
@Entity
@Scope("singleton")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	
}




