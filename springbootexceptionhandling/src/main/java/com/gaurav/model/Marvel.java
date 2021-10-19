package com.gaurav.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class Marvel {
	@Id
	@GeneratedValue
	private int marvel_id;
	private String name;
	private String weapons;
	private String color;
	
}
