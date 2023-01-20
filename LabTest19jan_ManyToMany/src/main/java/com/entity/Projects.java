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
public class Projects {

	@Id
	private int project_id;
	private String project_name;

	@ManyToMany
	private List<Employee> employee;
}
