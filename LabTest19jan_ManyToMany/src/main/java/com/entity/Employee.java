//declaring the package
package com.entity;

//importing the packages
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int emp_id;
	private String emp_name;

	@ManyToMany()
	private List<Projects> projects;

}
