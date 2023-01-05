package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@Column(unique = true)
	private int Roll_no;

	private String Std_name;

	private String Course;

	private double Marks;

	@Column(unique = true)
	private int Contact_no;

}
