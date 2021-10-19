package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	
	private String empname;
	
	private String salarly;
	
	
}
