package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Company {
	@Id
	@GeneratedValue
	private int companyid;
	
	private String companyname;
	
}
