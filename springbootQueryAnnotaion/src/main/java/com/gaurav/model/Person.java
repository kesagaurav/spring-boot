package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Person {

	@Id
	@GeneratedValue
	private int user_id;
	private String name;
	private String city;
	private String gender;
	private String salarly;
	private String contact;
	
}
